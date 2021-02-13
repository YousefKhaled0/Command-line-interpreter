package commands.helpers;

import java.io.File;
import java.io.FileNotFoundException;

public class FileHelper {

    public File getDir(File curr, String targetPath) throws FileNotFoundException {
        File target = new File(targetPath);
        if (target.isAbsolute()) {
            if (target.exists()) return target;
            else throw new FileNotFoundException("dir doesn't exist");
        }
        String path = String.format("%s/%s", curr.getAbsolutePath(), targetPath);
        target = new File(path);
        if (target.exists()) {
            if (!target.isDirectory())
                throw new IllegalArgumentException("---------arg isn't a dir.");
            return target;
        } else throw new FileNotFoundException("dir doesn't exist");
    }

    public void touchDir(File curr, String newDir) {
        File target = new File(newDir);
        if (target.isAbsolute()) {
            target.mkdir();
        }
        String path = String.format("%s/%s", curr.getAbsolutePath(), newDir);
        target = new File(path);
        target.mkdir();
    }

    public static void main(String[] args) throws FileNotFoundException {
        FileHelper fileHelper = new FileHelper();
        fileHelper.getDir(new File("."), "src");
    }

}
