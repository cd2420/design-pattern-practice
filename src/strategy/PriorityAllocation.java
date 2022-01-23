package strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class PriorityAllocation implements Scheduler {

    private List<Consultant> consultantList = new ArrayList<>();

    public PriorityAllocation() {
        consultantList.add(new Consultant(Consultant.Grade.LOW, "basic1"));
        consultantList.add(new Consultant(Consultant.Grade.MIDDLE, "basic2"));
        consultantList.add(new Consultant(Consultant.Grade.HIGH, "basic3"));
    }


    @Override
    public void getNextCall(ArrayList<Client> clientList) {
        Iterator<Client> clientIterator = clientList.stream()
                                                    .sorted()
                                                    .collect(Collectors.toList())
                                                    .iterator();

        while (clientIterator.hasNext()) {
            sendCallToAgent(clientIterator.next());
        }
    }

    @Override
    public void sendCallToAgent(Client client) {



        Iterator<Consultant> checkConsultant =  this.consultantList.stream()
                                                .sorted()
                                                .collect(Collectors.toList())
                                                .iterator();

        while (checkConsultant.hasNext()) {
            Consultant next = checkConsultant.next();
            if (next.getClientList().size() == 0) {
                next.getClientList().add(client);
                return;
            }
        }
    }

    @Override
    public void addConsultant(Consultant consultant) {
        this.consultantList.add(consultant);
    }

    @Override
    public ArrayList<Consultant> getConsutants() {
        return (ArrayList<Consultant>) this.consultantList;
    }
}
