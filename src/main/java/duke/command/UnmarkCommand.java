package duke.command;

import duke.Storage;
import duke.exception.DukeException;
import duke.task.Task;
import duke.task.TaskList;

/**
 * Represents command to unmark tasks as done.
 */
public class UnmarkCommand extends Command {
    private int index;

    /**
     * Creates UnmarkCommand.
     *
     * @param index Index of task to mark as not done.
     */
    public UnmarkCommand(int index) {
        this.index = index;
    }

    /**
     * Marks task as not done and prints it to user.
     * Also saves the updated tasks to storage.
     *
     * @param tasks List of tasks.
     * @param storage Storage for Duke's file operations.
     * @return Duke's response
     * @throws DukeException
     */
    @Override
    public String execute(TaskList tasks, Storage storage) throws DukeException {
        Task task = tasks.unmarkTask(index);
        storage.saveFile(tasks);

        return "OK, I've marked this task as not done yet:" + '\n'
                + "  " + task;

    }
}
