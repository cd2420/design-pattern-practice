package strategy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LeastJob implements Scheduler {

    private List<Consultant> consultantList = new ArrayList<>();

    public LeastJob() {
        consultantList.add(new Consultant(Consultant.Grade.LOW, "basic1"));
        consultantList.add(new Consultant(Consultant.Grade.MIDDLE, "basic2"));
        consultantList.add(new Consultant(Consultant.Grade.HIGH, "basic3"));
    }

    @Override
    public void getNextCall(ArrayList<Client> clientList) {

        Iterator<Client> clientIterator = clientList.iterator();

        while (clientIterator.hasNext()) {
            sendCallToAgent(clientIterator.next());
        }
    }

    @Override
    public void sendCallToAgent(Client client) {
        int nextCall = 0;
        int checkSize = 100000;

        for (int i = 0; i < consultantList.size(); i++) {
            if (consultantList.get(i).getClientList().size() == 0) {
                consultantList.get(i).pushClient(client);
                return;
            } else if (consultantList.get(i).getClientList().size() < checkSize) {
                checkSize = consultantList.get(i).getClientList().size();
                nextCall = i;
            }
        }
        consultantList.get(nextCall).pushClient(client);
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
