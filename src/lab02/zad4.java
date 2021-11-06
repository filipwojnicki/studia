package lab02;

import java.math.BigInteger;
import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("N = ");
        BigInteger value = new BigInteger(userInput.next());

        System.out.println(value.multiply(value));



        // BigInteger[][] szachownica = new BigInteger[n][n];

        // BigInteger mak = new BigInteger("1");

        // szachownica[0][0] = mak;

        // for(int x = 0; x < szachownica.length; x++) {
        //     for(int y = 1; y < szachownica.length; y++) {
        //         mak.multiply(2);
        //         szachownica[x][y] = mak;
        //     }
        // }

        // for(int x = 0; x < szachownica.length; x++) {
        //     for(int y = 1; y < szachownica.length; y++) {
        //         System.out.println(x + ", " + y + ": " + szachownica[x][y]);
        //     }
        // }
    }
}
