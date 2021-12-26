package bridge;

public interface AbstractList<T> {
    void addObject(T object);

    T getObject(int i);

    T removeObject(int i);

    int getSize();
}
