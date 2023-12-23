public class Main {
    public static void main(String[] args) {
        User user1 = new User("John");
        User user2 = new User("Mary");
        User user3 = new User("paul");

        Stock stock = new Stock();

        EmailStockSubscriber emailStockSubscriber = new EmailStockSubscriber();
        SMSStockSubscriber smsStockSubscriber = new SMSStockSubscriber();

        user1.subscribeToObserver(stock, emailStockSubscriber);
        user2.subscribeToObserver(stock, smsStockSubscriber);
        user2.subscribeToObserver(stock, emailStockSubscriber);
        user3.subscribeToObserver(stock, emailStockSubscriber);

        stock.setPrice(300);
        stock.setPrice(500);
    }
}