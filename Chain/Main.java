public class Main {
    public static void main(String[] args) {
        ReviewHandler factHandler = new ReviewHandler(new FactCheckReview());
        ReviewHandler typingHandler = new ReviewHandler(new TypingCheckReview());
        ReviewHandler somethingHandler = new ReviewHandler(new SomethingCheckReview());

        factHandler.setNext(typingHandler).setNext(somethingHandler);

        // ReviewHandler chain = factHandler;

        Article article = new Article("Some article text","some content");
        factHandler.handle(article);
    }
}