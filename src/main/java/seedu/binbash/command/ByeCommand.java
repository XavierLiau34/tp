package seedu.binbash.command;

import seedu.binbash.ui.Ui;
import seedu.binbash.storage.Storage;
import seedu.binbash.ItemList;

public class ByeCommand extends Command {
    public ByeCommand() {
        commandLogger.fine("Creating Bye Command...");
    }

    @Override
    public boolean execute(Ui ui, ItemList itemList, Storage storage) {
        ui.setUserAsInactive();
        executionUiOutput = "Bye!";
        return true;
    }
}
