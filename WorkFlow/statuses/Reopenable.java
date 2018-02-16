package WorkFlow.statuses;

public interface Reopenable {

    default Reopened getReopenedStatus() {
        return new Reopened();
    }

}
