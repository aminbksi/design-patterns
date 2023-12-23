public class User implements Observer {
    private String name;
    private Subject subject;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void subscribe(Subject subject) {
        this.subject = subject;
        subject.registerObserver(this);
    }

    @Override
    public void unsubscribe(Subject subject) {
        subject.removeObserver(this);
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}