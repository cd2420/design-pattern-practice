package decorator;

public class Americano extends Decorator {

    public Americano(Coffee coffee) {
        super(coffee);
    }

    @Override
    public void brewing() {
        super.brewing();
        System.out.println("adding espresso");
    }
}
