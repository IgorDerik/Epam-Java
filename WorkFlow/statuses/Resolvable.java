package WorkFlow.statuses;

public interface Resolvable {

    default Resolved getResolvedStatus() {
        return new Resolved();
    }

}
