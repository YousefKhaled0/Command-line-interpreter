package commands.ops;

import java.io.File;

public interface OperationCommand {
    void execute(File curr, String... args) throws Exception;
}
