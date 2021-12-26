package bridge;

public class Queue<T> extends List<T>{


    public Queue(AbstractList<T> impl) {
        super(impl);
        System.out.println("Queue가 구현되었습니다.");
    }

    public void push(T obj) {
        impl.addObject(obj);
    }

    public T popLeft() {
        return impl.removeObject(0);
    }
}
