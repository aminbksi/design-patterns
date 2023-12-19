public class ImagePost extends Post {
    private final String image;
    private final String author;

    public ImagePost(String image, String author) {
        this.image = image;
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    @Override
    public void display() {
        System.out.println("Displaying ImagePost : Image: " + image);
        super.display();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitImagePost(this);
    }
}
