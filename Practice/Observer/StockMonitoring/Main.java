public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "john@yahoo.com");
        User user2 = new User("Mary", "mary@yahoo.com");

        Stock stock = new Stock("Google", 100);

        EmailStockSubscriber emailStockSubscriber = new EmailStockSubscriber();
        SMSStockSubscriber smsStockSubscriber = new SMSStockSubscriber();

        user1.subscribe(stock, emailStockSubscriber);
        user2.subscribe(stock, smsStockSubscriber);
        user1.subscribe(stock, smsStockSubscriber);

        stock.setPrice(200);
        stock.setPrice(300);
    }
}
