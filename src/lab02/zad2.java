package lab02;

import java.io.FileReader;
import java.util.Scanner;

import lab02.zad1a;

public class zad2 {
    public static void main(String[] args) {
        try {
            Scanner userInput = new Scanner(System.in);

            System.out.println("Podaj nazwe pliku:");
            String fileName = userInput.nextLine();

            System.out.println("Podaj znak do zliczenia:");
            char c = userInput.next().charAt(0);


            StringBuilder fileContent = new StringBuilder();
            Scanner fileInput = new Scanner(new FileReader(fileName)); //"test.txt"

            while(fileInput.hasNext()) {
                fileContent.append(fileInput.next());
            }

            int charCount = zad1a.countChar(fileContent.toString(), c);

            System.out.println(charCount);

            System.out.println(fileContent.toString());
        } catch (Exception e) {
            System.out.println(e);
        }   
    }
}
