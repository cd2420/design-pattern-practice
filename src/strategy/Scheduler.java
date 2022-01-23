package strategy;


import java.util.ArrayList;

public interface Scheduler {

    void getNextCall(ArrayList<Client> clientList);
    void sendCallToAgent(Client client);
    void addConsultant(Consultant consultant);
    ArrayList<Consultant> getConsutants();
}
