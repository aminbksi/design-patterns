public class Main {
    public static void main(String[] args) {
        Post[] posts = {
                new TextPost("Post 1", "Uncle Bob"),
                new ImagePost("/src/image/img1.png", "Uncle Bob"),
                new VideoPost("/src/video/vid1.png", "John Doe")
        };

        for (Post post : posts) {
            post.display();
        }

        Visitor visitor = new PrintExportVisitor();
        for (Post post : posts) {
            post.accept(visitor);
        }
    }
}
