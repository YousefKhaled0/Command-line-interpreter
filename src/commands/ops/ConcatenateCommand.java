package commands.ops;

import java.io.File;

public class ConcatenateCommand implements OperationCommand {

    @Override
    public void execute(File curr, String... args) throws Exception {

    }
/**
    static void cat(File arr[], String fileName)
    {
        String absPath = lookup(arr, fileName) ;
        if(absPath.equals("Not found"))
        {
            System.out.println("No such file named: "+fileName);
            return ;
        }
        File f = new File(absPath) ;
        try {
            Scanner input = new Scanner(f) ;
            while(input.hasNextLine())
            {
                System.out.println(input.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }**/
}
