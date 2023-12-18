import java.util.ArrayList;
import java.util.List;

public class PostCollection implements IterableCollection<Post> {
    private List<Post> posts;

    public PostCollection() {
        posts = new ArrayList<>();
        // Initialize posts (Assuming there is a Post class)
        // ...
        posts.add(new Post("Post about design patterns", "Uncle Bob"));
        posts.add(new Post("Post about advanced design patterns", "Uncle Bob"));
        posts.add(new Post("Post about software architecture", "Uncle Bob"));
        posts.add(new Post("Post about machine learning", "Uncle Bob"));
        posts.add(new Post("Post about operating systems", "John Doe"));
        posts.add(new Post("Post about computer networks", "John Doe"));
    }

    @Override
    public Iterator createIterator(List<Post> items) {
        return new PostIterator(items);
    }

    public Iterator searchByText(String keyword) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (post.getText().contains(keyword)) {
                result.add(post);
            }
        }
        return createIterator(result);
    }

    public Iterator searchByAuthor(String keyword) {
        List<Post> result = new ArrayList<>();
        for (Post post : posts) {
            if (post.getAuthor().contains(keyword)) {
                result.add(post);
            }
        }
        return createIterator(result);
    }
}
