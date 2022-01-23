package bridge;

import java.util.ArrayList;

public class ArrayImpl<T> implements AbstractList<T> {

    ArrayList<T> arrayList;

    public ArrayImpl() {
        this.arrayList = new ArrayList<>();
        System.out.println("Array 로 구현합니다.");
    }

    @Override
    public void addElement(T object) {
        arrayList.add(object);
    }

    @Override
    public T getElement(int i) {
        return arrayList.get(i);
    }

    @Override
    public T deleteElement(int i) {
        return arrayList.remove(i);
    }

    @Override
    public int getElementSize() {
        return arrayList.size();
    }
}
