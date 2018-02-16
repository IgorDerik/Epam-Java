package WorkFlow;

import WorkFlow.statuses.Assigned;
import WorkFlow.statuses.Opened;

public class Main {

    public static void main(String[] args) {

        Task fixSomeBug = new Task();

        Opened opened = new Opened();

        fixSomeBug.setStatus(opened);

        System.out.println(fixSomeBug.getStatus().getStatusName());

        Assigned assigned = opened.getAssignedStatus();

        fixSomeBug.setStatus(assigned);

        System.out.println(fixSomeBug.getStatus().getStatusName());

    }

}
