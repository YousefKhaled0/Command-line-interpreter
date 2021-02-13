package commands.ops;

import commands.helpers.FileHelper;

import java.io.File;

public class MakeDirectoryCommand implements OperationCommand {

    FileHelper fileHelper = new FileHelper();

    @Override
    public void execute(File curr, String... args) throws Exception {
        for (String arg : args) {
            fileHelper.touchDir(curr, arg);
        }
    }

}
