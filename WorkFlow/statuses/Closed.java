package WorkFlow.statuses;

public class Closed extends Status implements Reopenable {
    public Closed() {
        setStatusName("Closed");
    }
}
