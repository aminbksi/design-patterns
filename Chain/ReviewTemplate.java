public abstract class ReviewTemplate {
    protected Article article;

    public final boolean review(Article article) {
        this.article = article;
        receive();
        makeChanges();
        return approve();
    }

    protected void receive() {
        System.out.println("Article " + article.getTitle() + " received.");
    }

    protected abstract void makeChanges();

    protected boolean approve() {
        // Default approval logic
        return true;
    }
}