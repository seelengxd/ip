package duke.command;

import duke.*;

public class MarkCommand extends Command {
    private int index;

    public MarkCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList taskList, Ui ui, Storage storage) throws DukeException {
        Task task = taskList.markTask(index);
        ui.printWithIndent("Nice! I've marked this task as done:");
        ui.printWithIndent("  " + task);
        storage.saveFile(taskList);
    }
}