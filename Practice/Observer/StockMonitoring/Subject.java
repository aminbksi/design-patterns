
public interface Subject {
    void registerObserver(Observer observer, User user);
    void removeObserver(Observer observer);
    void notifyObservers();
}