package collectionsqueue.todo;

public class ToDo {
    private String description;
    private boolean isUrgent;

    public ToDo(String description, boolean isUrgent) {
        this.description = description;
        this.isUrgent = isUrgent;
    }

    public ToDo(boolean isUrgent) {
        this.isUrgent = isUrgent;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isUrgent() {
        return isUrgent;
    }

    public void setUrgent(boolean urgent) {
        isUrgent = urgent;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "description='" + description + '\'' +
                ", isUrgent=" + isUrgent +
                '}';
    }
}
