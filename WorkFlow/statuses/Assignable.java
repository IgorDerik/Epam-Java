package WorkFlow.statuses;

public interface Assignable {

    default Assigned getAssignedStatus () {
        return new Assigned();
    }

}
