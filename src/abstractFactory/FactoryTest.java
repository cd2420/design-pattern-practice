package abstractFactory;

import abstractFactory.factory.Factory;
import abstractFactory.factory.hyundai.HyundaiFactory;
import abstractFactory.factory.kia.KiaFactory;
import abstractFactory.product.car.Car;
import abstractFactory.product.car.dao.CarDao;
import abstractFactory.product.machine.Machine;
import abstractFactory.product.machine.dao.MachineDao;

public class FactoryTest {



    public static void main(String[] args) {
        String company = "hyundai";
//        String company = "kia";

        Factory factory;
        CarDao carDao;
        MachineDao machineDao;

        if (company.equals("hyundai")) {
            factory = new HyundaiFactory();
        } else {
            factory = new KiaFactory();
        }

        carDao = factory.createCarDao();
        machineDao = factory.createMachineDao();

        Car car = new Car("붕붕카");
        Machine machine = new Machine("로봇캅");

        carDao.createCar(car);
        carDao.deleteCar(car);
        carDao.updateCar(car);

        machineDao.createMachine((machine));
        machineDao.deleteMachine((machine));
        machineDao.updateMachine((machine));
    }
}
