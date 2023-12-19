public class VideoPost extends Post {
    private final String video;
    private final String author;

    public VideoPost(String video, String author) {
        this.video = video;
        this.author = author;
    }

    public String getVideo() {
        return video;
    }

    @Override
    public void display() {
        System.out.println("Displaying VideoPost : Video: " + video);
        super.display();
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visitVideoPost(this);
    }
}
