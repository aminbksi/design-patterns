import java.util.ArrayList;
import java.util.List;

public class MessageSystem implements Subject {
    private List<Observer> observers;
    private String message;

    public MessageSystem() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (!observers.contains(observer))
            observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }
    
    @Override
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

    public void sendMessage(String message) {
        this.message = message;
        notifyObservers(message);
    }
}