package bridge;

import java.util.LinkedList;

public class LinkedImpl<T> implements AbstractList<T> {

    LinkedList<T> linkedList;

    public LinkedImpl() {
        linkedList = new LinkedList<>();
        System.out.println("Linked 로 구현합니다.");
    }

    @Override
    public void addElement(T object) {
        linkedList.add(object);
    }

    @Override
    public T getElement(int i) {
        return linkedList.get(i);
    }

    @Override
    public T deleteElement(int i) {
        return linkedList.remove(i);
    }

    @Override
    public int getElementSize() {
        return linkedList.size();
    }
}
