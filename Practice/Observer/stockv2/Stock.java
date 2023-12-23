import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Stock implements Subject {
    private double price;

    private Map<Observer, List<User>> observerUserMap = new HashMap<>();

    public void setPrice(double price) {
        this.price = price;
        notifyObservers();
    }

    public double getPrice() {
        return price;
    }

    @Override
    public void registerObserver(Observer observer, User user) {
        observerUserMap.computeIfAbsent(observer, k -> new ArrayList<>()).add(user);
    }

    @Override
    public void removeObserver(Observer observer) {
        observerUserMap.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Map.Entry<Observer, List<User>> entry : observerUserMap.entrySet()) {
            Observer observer = entry.getKey();
            List<User> users = entry.getValue();
            for (User user : users) {
                observer.update(this, user);
            }
        }
    }
}