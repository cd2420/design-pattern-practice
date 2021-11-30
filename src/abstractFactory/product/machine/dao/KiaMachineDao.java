package abstractFactory.product.machine.dao;

import abstractFactory.product.machine.Machine;

public class KiaMachineDao implements MachineDao {

    @Override
    public void createMachine(Machine machine) {
        System.out.println("create kia machine : " + machine.getName());
    }

    @Override
    public void deleteMachine(Machine machine) {
        System.out.println("delete kia machine : " + machine.getName());
    }

    @Override
    public void updateMachine(Machine machine) {
        System.out.println("update kia machine : " + machine.getName());
    }
}
