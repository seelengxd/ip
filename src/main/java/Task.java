public class Task {
    String description;
    private boolean done;

    public Task(String description) {
        this.description = description;
        this.done = false;
    }

    public void markDone() {
        this.done = true;
    }

    public void unmarkDone() {
        this.done = false;
    }

    @Override
    public String toString() {
        char doneFlag = done ? 'X' : ' ';
        return String.format("[%c] %s", doneFlag, description);
    }
}