package bridge;

public class Stack<T> extends List<T>{

    public Stack(AbstractList<T> list) {
        super(list);
        System.out.println("Stack이 구현되었습니다.");
    }

    public void push(T obj) {
        impl.addObject(obj);
    }

    public T pop() {
        return impl.removeObject(impl.getSize() - 1);
    }
}
