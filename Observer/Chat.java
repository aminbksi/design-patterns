import java.util.ArrayList;
import java.util.List;

// Observer interface
interface Observer {
    void update(String message);
}

// Channel class
class Channel {
    private List<Observer> observers;

    public Channel() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void sendMessage(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

// User class implementing Observer
class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println(name + " received: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        Channel chatChannel = new Channel();
        User user1 = new User("Ali");
        User user2 = new User("Reza");

        chatChannel.addObserver(user1);
        chatChannel.addObserver(user2);

        chatChannel.sendMessage("Hello everyone!");
    }
}
