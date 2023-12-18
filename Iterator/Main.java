import java.util.List;

public class Main {
    public static void main(String[] args) {
        PostCollection postCollection = new PostCollection();

        Iterator posts = postCollection.searchByText("design patterns");

        while (posts.hasNext()) {
            Post post = (Post) posts.getNext();
            System.out.println(post.getText());
        }

        Iterator posts2 = postCollection.searchByAuthor("Uncle Bob");

        while (posts2.hasNext()) {
            Post post = (Post) posts2.getNext();
            System.out.println(post.getBook());
        }
    }
}