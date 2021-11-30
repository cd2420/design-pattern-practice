package abstractFactory.product.machine.dao;

import abstractFactory.product.machine.Machine;

public interface MachineDao {

    public void createMachine(Machine machine);
    public void deleteMachine(Machine machine);
    public void updateMachine(Machine machine);
}
