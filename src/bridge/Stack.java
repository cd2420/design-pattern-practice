package bridge;

public class Stack<T> extends List<T>{

    public Stack(AbstractList list) {
        super(list);
        System.out.println("Stack을 구현합니다.");
    }

    public void push(T obj) {
        add(obj);
    }

    public T pop() {
        return remove(getSize() - 1);
    }
}
