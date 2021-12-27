package stratege;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    public static void main(String[] args) {

        ArrayList<Client> waitings1 = new ArrayList<>();
        waitings1.addAll(
                List.of(
                    new Client(Client.Grade.LOW, "3")
                    , new Client(Client.Grade.MIDDLE, "2")
                    , new Client(Client.Grade.HIGH, "1")
                )
        );

        Scanner sc = new Scanner(System.in);

        Scheduler scheduler;
        String type = sc.nextLine();

        if (type.equals("l")) {
            scheduler = new LeastJob();
        } else if (type.equals("p")) {
            scheduler = new PriorityAllocation();
        } else {
            scheduler = new RoundRobin();
        }

        scheduler.getNextCall(waitings1);
        System.out.println(scheduler.getConsutants().toString());

    }
}
