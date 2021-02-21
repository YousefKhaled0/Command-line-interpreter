package commands.print;

public interface PrintCommand {
    void execute(String... args) throws IllegalArgumentException;
}
