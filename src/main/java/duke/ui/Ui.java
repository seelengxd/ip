package duke.ui;

import java.util.Scanner;

/**
 * Represents the user interface and handles all input and output.
 * Including styles like colours, indentation and lines.
 */
public class Ui {
    private Scanner scanner = new Scanner(System.in);

    /**
     * Returns error message with a sad face.
     *
     * @param error String of the error message.
     */
    public String getError(String error) {
        return "☹ Oh no! " + error;
    }

    /**
     * Returns "Now you have {taskCount} tasks in the list.".
     *
     * @param taskCount Number of tasks.
     */
    public String getTaskCount(int taskCount) {
        return String.format("Now you have %d tasks in the list.", taskCount);
    }

    /**
     * Greets the user with a coloured logo.
     */
    public String getGreeting() {
        return "Hi! I am Duke! :^)";
    }
}