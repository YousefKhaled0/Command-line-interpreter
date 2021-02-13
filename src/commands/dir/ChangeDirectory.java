package commands.dir;

import commands.helpers.FileHelper;

import java.io.File;

public class ChangeDirectory implements DirectoryCommand {

    private FileHelper fileHelper = new FileHelper();

    @Override
    public File execute(File curr, String... args) throws Exception {
        if (args == null || args.length < 1) {
            throw new IllegalArgumentException("---------Too few args.");
        }
        if (args.length > 1) {
            throw new IllegalArgumentException("---------Too many args.");
        }
        return fileHelper.getDir(curr, args[0]);
    }
}
