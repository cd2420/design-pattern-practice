package abstractFactory.product.machine.dao;

import abstractFactory.product.machine.Machine;

public class HyundaiMachineDao implements MachineDao {

    @Override
    public void createMachine(Machine machine) {
        System.out.println("create hyundai machine : " + machine.getName());
    }

    @Override
    public void deleteMachine(Machine machine) {
        System.out.println("delete hyundai machine : " + machine.getName());
    }

    @Override
    public void updateMachine(Machine machine) {
        System.out.println("update hyundai machine : " + machine.getName());
    }
}
