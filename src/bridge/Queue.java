package bridge;

public class Queue<T> extends List<T>{

    public Queue(AbstractList list) {
        super(list);
        System.out.println("Queue를 구현합니다.");
    }

    public void enQueue(T obj) {
        add(obj);
    }

    public T deQueue() {
        return remove(0);
    }
}
