package commands.dir;

import java.io.File;

public interface DirectoryCommand {
    File execute(File curr, String... args) throws Exception;
}
