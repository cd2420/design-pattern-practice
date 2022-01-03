package memento;

public class Test {

    public static void main(String[] args) {
        CareTaker careTaker = new CareTaker();
        Originator originator = new Originator();
        originator.setState("state #1");
        originator.setState("state #2");
        careTaker.addMemento(originator.saveMemento());
        originator.setState("state #3");
        careTaker.addMemento(originator.saveMemento());
        originator.setState("state #4");

        System.out.println("current state :" + originator.getState());
        originator.getStateFromMemento(careTaker.getMementoIndex(0));
        System.out.println("first state : " + originator.getState());
        originator.getStateFromMemento(careTaker.getMementoIndex(1));
        System.out.println("second state : " + originator.getState());
    }
}
