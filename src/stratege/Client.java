package stratege;

public class Client implements Comparable<Client> {

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

    public Client(Grade grade, String name) {
        this.grade = grade;
        this.name = name;
    }

    @Override
    public int compareTo(Client o) {
        return Integer.compare(this.grade.getLevel() * -1, o.getGrade() * -1);
    }

    public int getGrade() {
        return this.grade.getLevel();
    }

    @Override
    public String toString() {
        return "Client{" +
                "grade=" + grade +
                ", name='" + name + '\'' +
                '}';
    }
}
