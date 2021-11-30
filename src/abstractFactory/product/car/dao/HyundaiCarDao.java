package abstractFactory.product.car.dao;

import abstractFactory.product.car.Car;

public class HyundaiCarDao implements CarDao {
    @Override
    public void createCar(Car car) {
        System.out.println("create hyundai car : " + car.getName());
    }

    @Override
    public void deleteCar(Car car) {
        System.out.println("delete hyundai car : " + car.getName());
    }

    @Override
    public void updateCar(Car car) {
        System.out.println("update hyundai car : " + car.getName());
    }
}
