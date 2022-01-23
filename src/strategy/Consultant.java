package strategy;


import java.util.ArrayList;
import java.util.List;

public class Consultant implements Comparable<Consultant> {

    enum Grade {
        LOW(0),
        MIDDLE(1),
        HIGH(2);

        private final int level;

        Grade(int level) {
            this.level = level;
        }

        int getLevel() {
            return this.level;
        }

    }

    private Grade grade;
    private String name;
    private List<Client> clientList;

    public Consultant(Grade grade, String name) {
        this.grade = grade;
        this.name = name;
        this.clientList = new ArrayList<Client>();
    }

    public List<Client> getClientList() {
        return clientList;
    }

    @Override
    public int compareTo(Consultant o) {
        return Integer.compare(this.grade.getLevel() * -1, o.getGrade() * -1);

    }

    public int getGrade() {
        return this.grade.getLevel();
    }

    public void pushClient(Client client) {
        this.clientList.add(client);
    }

    @Override
    public String toString() {
        return "Consultant{ name = " + name +
                ", clientList=" + clientList +
                '}';
    }
}
