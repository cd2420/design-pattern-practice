package bridge;

public interface AbstractList<T> {
    void addElement(T object);

    T getElement(int i);

    T deleteElement(int i);

    int getElementSize();
}
