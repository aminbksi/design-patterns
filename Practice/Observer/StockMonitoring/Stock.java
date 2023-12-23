import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Stock implements Subject {
    private String name;
    private double price;
    private List<Map.Entry<Observer, User>> observers;

    public Stock(String name, double price) {
        this.name = name;
        this.price = price;
        observers = new ArrayList<>();
    }

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void registerObserver(Observer o, User u) {
        observers.add(new AbstractMap.SimpleEntry<>(o, u));
    }

    public void removeObserver(Observer o) {
        // not necessary, 
    }

    public void notifyObservers() {
        for (Map.Entry<Observer, User> pair : observers) {
            Observer observer = pair.getKey();
            User user = pair.getValue();
            observer.update(this, user);
        }
    }
}