package abstractFactory.factory.kia;

import abstractFactory.factory.Factory;
import abstractFactory.product.car.dao.CarDao;
import abstractFactory.product.car.dao.KiaCarDao;
import abstractFactory.product.machine.dao.KiaMachineDao;
import abstractFactory.product.machine.dao.MachineDao;

public class KiaFactory implements Factory {
    @Override
    public CarDao createCarDao() {
        return new KiaCarDao();
    }

    @Override
    public MachineDao createMachineDao() {
        return new KiaMachineDao();
    }
}
