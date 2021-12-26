package bridge;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T>{

    ArrayList<T> list = new ArrayList<>();

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
