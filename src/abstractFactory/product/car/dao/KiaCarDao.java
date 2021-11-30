package abstractFactory.product.car.dao;

import abstractFactory.product.car.Car;

public class KiaCarDao implements CarDao {
    @Override
    public void createCar(Car car) {
        System.out.println("create kia car : " + car.getName());
    }

    @Override
    public void deleteCar(Car car) {
        System.out.println("delete kia car : " + car.getName());
    }

    @Override
    public void updateCar(Car car) {
        System.out.println("update kia car : " + car.getName());
    }
}
