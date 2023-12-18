public class Post {
    private String text;
    private String author;

    // Constructor
    public Post(String text, String author) {
        this.text = text;
        this.author = author;
    }

    // Getters and setters (if needed)
    public String getBook(){
        return text + " by " + author;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}
