package commands.ops;

import java.io.File;

public class RemoveDirectoryCommand extends OperationCommand {

    @Override
    public void execute(File curr, String... args) throws Exception {
        if (args == null || args.length == 0) {
            throw new IllegalArgumentException("-----Too few args.");
        }
        for (String arg : args) {
            fileHelper.getDir(curr, arg).delete();
        }
    }
}
