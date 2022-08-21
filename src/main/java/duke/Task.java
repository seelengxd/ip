package duke;

import java.time.LocalDate;
public abstract class Task {
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

    public String toFileRepresentation() {
        return String.format("%d | %s", this.done ? 1 : 0, this.description);
    }

    public static Task fromFileRepresentation(String rep) {
        return null;
    }

    public boolean isOn(LocalDate date) {
        return false;
    }

    /**
     * Return whether the description includes the search query
     * @param searchQuery String to search.
     * @return whether the description includes the search query
     */
    public boolean descriptionIncludes(String searchQuery) {
        return description.contains(searchQuery);
    }

    @Override
    public String toString() {
        char doneFlag = done ? 'X' : ' ';
        return String.format("[%c] %s", doneFlag, description);
    }
}
