package stratege;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class RoundRobin implements Scheduler{

    private List<Consultant> consultantList = new ArrayList<>();
    private int num;

    public RoundRobin() {
        consultantList.add(new Consultant(Consultant.Grade.LOW, "basic1"));
        consultantList.add(new Consultant(Consultant.Grade.MIDDLE, "basic2"));
        consultantList.add(new Consultant(Consultant.Grade.HIGH, "basic3"));
        this.num = 0;
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

        if (this.num >= consultantList.size()) {
            this.num = 0;
        }
        this.consultantList.get(this.num).pushClient(client);
        this.num++;
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
