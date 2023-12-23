
public class SMSStockSubscriber implements Observer {


    @Override
    public void update(Stock stock, User user) {
        user.update(stock, this);
    }
}