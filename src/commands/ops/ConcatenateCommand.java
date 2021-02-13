package commands.ops;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConcatenateCommand extends OperationCommand {


    @Override
    public void execute(File curr, String... args) throws Exception {
        if (args == null || args.length < 1) {
            throw new IllegalArgumentException("---------Too few args.");
        }
        for (String arg : args) {
            cat(fileHelper.getFile(curr, arg));
        }
    }

    private void cat(File f) throws FileNotFoundException {
        Scanner input = new Scanner(f);
        while (input.hasNextLine()) {
            System.out.println(input.nextLine());
        }
    }
}