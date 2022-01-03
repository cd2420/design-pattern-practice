package memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList;

    public CareTaker() {
        this.mementoList = new ArrayList<>();
    }

    public void addMemento(Memento memento) {
        this.mementoList.add(memento);
    }

    public Memento getMementoIndex(int idx) {
        return this.mementoList.get(idx);
    }

}
