package abstractFactory.product.car.dao;

import abstractFactory.product.car.Car;

public interface CarDao {

    public void createCar(Car car);
    public void deleteCar(Car car);
    public void updateCar(Car car);
}
