import java.util.concurrent.atomic.AtomicInteger;

public abstract class Post {
    private static final AtomicInteger ID_COUNTER = new AtomicInteger(0);
    private final int id;
    private int displayCount;

    public Post() {
        this.id = ID_COUNTER.incrementAndGet();
    }

    public int getId() {
        return id;
    }

    public int getDisplayCount() {
        return displayCount;
    }

    public void display() {
        displayCount++;
    }

    public abstract void accept(Visitor visitor);
}
