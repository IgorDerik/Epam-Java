package WorkFlow.statuses;

public class Resolved extends Status implements Closable, Reopenable {
    public Resolved() {
        setStatusName("Resolved");
    }
}
