package duke.command;

import duke.Storage;
import duke.exception.DukeException;
import duke.task.Task;
import duke.task.TaskList;

/**
 * Represents the command to mark tasks as done.
 */
public class MarkCommand extends Command {
    private int index;

    /**
     * Creates mark command.
     *
     * @param index Index of task to be marked as done.
     */
    public MarkCommand(int index) {
        this.index = index;
    }

    /**
     * Marks task as done and prints it to user.
     * Also saves the updated tasks to storage.
     *
     * @param tasks List of tasks.
     * @param storage Storage for Duke's file operations.
     * @return Duke's response.
     * @throws DukeException
     */
    @Override
    public String execute(TaskList tasks, Storage storage) throws DukeException {
        Task task = tasks.markTask(index);
        assert task.isDone() : "Task should be marked done";

        storage.saveFile(tasks);
        return "Nice! I've marked this task as done:" + '\n'
                + "  " + task;
    }
}
