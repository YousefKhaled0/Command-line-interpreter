package terminal;

import java.io.File;
import java.util.Scanner;

public class Terminal {
    private File curr;
    private CommandSearch commandSearch = new CommandSearch();

    public Terminal() {
        String os = System.getProperty("os.name");
        String message = System.getProperty("user.name");
        if (os.toLowerCase().contains("windows")) {
            curr = new File("C:\\");
            message = "command: ";
        } else {
            curr = new File("/home");
            message += "@linux: ";
        }
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print(message);
            String command = scanner.nextLine();
            try {
                curr = commandSearch.findAndExecute(command, curr);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }
}
