package bridge;

public class List<T> {

    AbstractList<T> impl;

    public List(AbstractList<T> impl) {
        this.impl = impl;
    }

    public void add(T object) {
        impl.addObject(object);
    }

    public T get(int i) {
        return impl.getObject(i);
    }

    public T remove(int i) {
        return impl.removeObject(i);
    }

    public int size() {
        return impl.getSize();
    }

}
