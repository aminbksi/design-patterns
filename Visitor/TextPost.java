public class TextPost extends Post {
    private final String text;
    private final String author;

    public TextPost(String text, String author) {
        this.text = text;
        this.author = author;
    }

    public String getText() {
        return text;
    }

    @Override
    public void display() {
        System.out.println("Displaying TextPost : Text: " + text);
        super.display();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitTextPost(this);
    }
}
