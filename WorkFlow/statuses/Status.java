package WorkFlow.statuses;

public abstract class Status {

    private String status;

    public void setStatusName(String status) {
        this.status = status;
    }

    public String getStatusName() {
        return status;
    }

}