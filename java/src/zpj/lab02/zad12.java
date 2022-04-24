package zpj.lab02;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class zad12 {

  public static void main(String[] args) {
    try {
      File tmp = new File("./");
      FilenameFilter filenameFilter = (file, s) -> s.endsWith(".txt");

      String[] list = tmp.list(filenameFilter);

      System.out.println(Arrays.toString(list));

  } catch (Exception e) {
      e.printStackTrace();
  }
  }
}