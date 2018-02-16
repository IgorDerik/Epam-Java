package WorkFlow;

import WorkFlow.statuses.Opened;

public class Main {

    public static void main(String[] args) {

        Task fixSomeBug = new Task();

        fixSomeBug.setStatus(new Opened());

        System.out.println(fixSomeBug.getStatus().getStatusName());

    }

}
