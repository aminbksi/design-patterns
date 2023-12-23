
public class EmailStockSubscriber implements Observer {

    @Override
    public void update(Stock stock, User user) {
        user.update(stock, this);
    }
}