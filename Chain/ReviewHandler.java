public class ReviewHandler {
    private final ReviewTemplate reviewer;
    private ReviewHandler nextHandler;

    public ReviewHandler(ReviewTemplate reviewer) {
        this.reviewer = reviewer;
    }

    public ReviewHandler setNext(ReviewHandler handler) {
        nextHandler = handler;
        return handler;
    }

    public void handle(Article article) {
        boolean ok = reviewer.review(article);
        if (ok) {
            System.out.println("Check passed.");
            if (nextHandler != null) {
                nextHandler.handle(article);
            }
        } else {
            System.out.println("Rejected");
        }
    }
}