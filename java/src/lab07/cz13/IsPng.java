package lab07.cz13;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IsPng {
  public static void main(String[] args) throws IOException {
    byte[] fileContent = Files.readAllBytes(Paths.get("test.png"));
    int[] pngBytes = new int[] {137, 80, 78, 71, 13, 10, 26, 10};

    int correctness = 0;
 
    for(int i = 0; i < 8; i++) {
      if(fileContent[i] == pngBytes[i]) {
        correctness++;
      }
    }

    System.out.println(correctness == 7 ? "true" : "false");
  }
}