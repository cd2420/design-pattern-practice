package bridge;

import java.util.LinkedList;

public class LinkedImpl<T> implements AbstractList<T>{

    LinkedList<T> list = new LinkedList<>();

    @Override
    public void addObject(T object) {
        list.add(object);
    }

    @Override
    public T getObject(int i) {
        return list.get(i);
    }

    @Override
    public T removeObject(int i) {
        return list.remove(i);
    }

    @Override
    public int getSize() {
        return list.size();
    }
}
