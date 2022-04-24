package zpj.lab02;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;

public class zad11 {
  public static void main(String args[]) {

    try {
        File path = new File("./");
        FileFilter fileFilter = file -> file.isDirectory();

        File[] list = path.listFiles(fileFilter);

        System.out.println(Arrays.toString(list));
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
