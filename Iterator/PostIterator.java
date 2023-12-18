import java.util.List;

public class PostIterator implements Iterator {
    private List<Post> posts;
    private int index;

    public PostIterator(List<Post> posts) {
        this.posts = posts;
        this.index = 0;
    }

    @Override
    public Object getNext() {
        if (hasNext()) {
            Post result = posts.get(index);
            index++;
            return result;
        }
        return null;
    }

    @Override
    public boolean hasNext() {
        return index < posts.size();
    }
}
