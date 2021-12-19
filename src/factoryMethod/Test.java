package factoryMethod;

public class Test {

    public static void main(String[] args) {
        Factory factory = new HyundaiFactory();
        Car sonata = factory.createCar("sonata");
        Car myCar = factory.createCar("myCar");

        System.out.println(sonata);
        System.out.println(myCar);

        Car car = factory.returnMyCar("Lim");
        Car otherCar = factory.returnMyCar("he");
        System.out.println(car == otherCar);
    }
}
