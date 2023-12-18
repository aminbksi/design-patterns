import java.util.List;

public interface IterableCollection<T> {
    Iterator createIterator(List<T> items);
}
