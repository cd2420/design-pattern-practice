package abstractFactory.factory.hyundai;

import abstractFactory.factory.Factory;
import abstractFactory.product.car.dao.CarDao;
import abstractFactory.product.car.dao.HyundaiCarDao;
import abstractFactory.product.machine.dao.HyundaiMachineDao;
import abstractFactory.product.machine.dao.MachineDao;

public class HyundaiFactory implements Factory {
    @Override
    public CarDao createCarDao() {
        return new HyundaiCarDao();
    }

    @Override
    public MachineDao createMachineDao() {
        return new HyundaiMachineDao();
    }
}
