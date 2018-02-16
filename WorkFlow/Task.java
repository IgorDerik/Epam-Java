package WorkFlow;

import WorkFlow.statuses.Status;

public class Task {

    private String name;
    private String description;
    private Status status;
    private String worker;

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void setWorker(String worker) {
        this.worker = worker;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public Status getStatus() {
        return status;
    }

    public String getWorker() {
        return worker;
    }
}
