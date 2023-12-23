
public interface Observer {
    void update(String message);
    void subscribe(Subject subject);
    void unsubscribe(Subject subject);
}



