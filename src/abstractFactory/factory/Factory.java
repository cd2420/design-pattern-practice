package abstractFactory.factory;

import abstractFactory.product.car.dao.CarDao;
import abstractFactory.product.machine.dao.MachineDao;

public interface Factory {
    public CarDao createCarDao();
    public MachineDao createMachineDao();
}
