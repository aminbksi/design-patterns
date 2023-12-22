public enum DocumentElementType {
    PARAGRAPH,
    TABLE,
    IMAGE
}

public interface DocumentElement {
    void display();
    DocumentElementType getType();
}

public class Paragraph implements DocumentElement {
    @Override
    public void display() {
        System.out.println("Paragraph");
    }
}

public class Table implements DocumentElement {
    @Override
    public void display() {
        System.out.println("Table");
    }
}

public class Image implements DocumentElement {
    @Override
    public void display() {
        System.out.println("Image");
    }
}

public interface Document {
    void add(DocumentElement element);
    void remove(DocumentElement element);
    DocumentIterator createIterator();
    void createIterator(DocumentElementType type);
}



public class ConcreteDocument implements Document {
    private List<DocumentElement> elements;

    public ConcreteDocument() {
        this.elements = new ArrayList<>();
    }

    @Override
    public void add(DocumentElement element) {
        this.elements.add(element);
    }

    @Override
    public void remove(DocumentElement element) {
        this.elements.remove(element);
    }

    @Override
    public void createIterator() {
        return new ConcreteDocumentIterator(this.elements);
    }

    @Override
    public DocumentIterator createIterator(DocumentElementType type) {
        List<DocumentElement> filteredElements = this.elements.stream()
                .filter(element -> element.getType() == type)
                .collect(Collectors.toList());
        return new ConcreteDocumentIterator(filteredElements);
    }
}

public interface DocumentIterator {
    boolean hasNext();
    DocumentElement next();
}

public class ConcreteDocumentIterator implements DocumentIterator {
    private List<DocumentElement> elements;
    private int position;


    public ConcreteDocumentIterator(List<DocumentElement> elements) {
        this.elements = elements;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return this.position < this.elements.size();
    }

    @Override
    public DocumentElement next() {
        return this.elements.get(this.position++);
    }
}

public class Main {
    public static void main(String[] args) {
        Document document = new ConcreteDocument();
        document.add(new Paragraph());
        document.add(new Table());
        document.add(new Image());
        document.add(new Paragraph());
        document.add(new Table());
        document.add(new Image());

        DocumentIterator iterator = document.createIterator();
        while (iterator.hasNext()) {
            iterator.next().display();
        }

        System.out.println("Paragraphs:");
        iterator = document.createIterator(DocumentElementType.PARAGRAPH);
        while (iterator.hasNext()) {
            iterator.next().display();
        }

        System.out.println("Tables:");
        iterator = document.createIterator(DocumentElementType.TABLE);
        while (iterator.hasNext()) {
            iterator.next().display();
        }

        System.out.println("Images:");
        iterator = document.createIterator(DocumentElementType.IMAGE);
        while (iterator.hasNext()) {
            iterator.next().display();
        }
    }
}