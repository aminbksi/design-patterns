public class User {
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName(){
        return name;
    }

    public void subscribe(Subject subject, Observer observer) {
        subject.registerObserver(observer, this);
    }

    public void unsubscribe(Subject subject, Observer observer) {
        subject.removeObserver(observer);
    }

    public void update(Stock stock, Observer observer) {
        System.out.println("User " + name + " has been notified that " + stock.getName() + " has changed to " + stock.getPrice() + " by " + observer.getClass().getSimpleName());
    }
}
