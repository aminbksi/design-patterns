public interface Document {
    void getContent();
}

public class RealDocument implements Document {
    private String content;

    public RealDocument(String content) {
        this.content = content;
        System.out.println("Loading content from disk...");
    }

    @Override
    public void getContent() {
        System.out.println("Showing content: " + content);
    }
}

public interface User {
    boolean hasPermission(String permission);
}

public class Admin implements User {
    @Override
    public boolean hasPermission(String permission) {
        return true; 
    }
}

public class Guest implements User {
    @Override
    public boolean hasPermission(String permission) {
        return false; 
    }
}

public class DocumentProxy implements Document {
    private Document document;
    private User user;

    public DocumentProxy(Document document, User user) {
        this.document = document;
        this.user = user;
    }

    @Override
    public void getContent() {
        if (user.hasPermission("viewContent")) {
            document.getContent();
        } else {
            System.out.println("You are not allowed to see the content");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Document realDocument = new RealDocument("Hello world!");

        User admin = new Admin();
        User guest = new Guest();

        DocumentProxy documentProxyForAdmin = new DocumentProxy(realDocument, admin);
        documentProxyForAdmin.getContent(); 

        
        DocumentProxy documentProxyForGuest = new DocumentProxy(realDocument, guest);
        documentProxyForGuest.getContent(); 
    }
}
