package factoryMethod;

import java.util.HashMap;
import java.util.Map;

public class HyundaiFactory implements Factory{

    Map<String, Car> carMap = new HashMap<>();

    @Override
    public Car createCar(String name) {
        Car car = null;
        if (name == "sonata") {
            car = new Sonata();
        } else {
            car = new Santafe();
        }
        return car;
    }

    @Override
    public Car returnMyCar(String name) {
        Car car = carMap.get(name);
        if (car == null) {
            if (name == "Lim") {
                car = new Santafe();
            } else {
                car = new Sonata();
            }
            carMap.put(name, car);
        }
        return car;
    }
}
