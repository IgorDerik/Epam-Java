package WorkFlow.statuses;

public interface Closable {

    default Closed getClosedStatus() {
        return new Closed();
    }

}
