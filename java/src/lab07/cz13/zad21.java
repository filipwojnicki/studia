package lab07.cz13;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class zad21 {
  public static void main(String[] args) throws IOException {
    System.out.println(getLongestLineLength("IsPng.java"));
    System.out.println(getLongestLine("IsPng.java"));
  }

  public static int getLongestLineLength(String filename) throws IOException {
    int longestLineLength = 0;

    try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
      for(String line; (line = br.readLine()) != null; ) {
        if(line.length() > longestLineLength) {
          longestLineLength = line.length();
        }
      }
    } catch (IOException e) {
      return -1;
    }

    return longestLineLength;
  }

  public static String getLongestLine(String filename) throws IOException {
    String longestLine = "";

    try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
      for(String line; (line = br.readLine()) != null; ) {
        if(line.length() > longestLine.length()) {
          longestLine = line;
        }
      }
    } catch (IOException e) {
      return null;
    }

    return longestLine;
  }
}