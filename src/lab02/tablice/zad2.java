package lab02.tablice;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;
import java.util.ArrayList;

public class zad2 {
    public static void generuj(int tab[], int n, int minWartosc, int maxWartosc) {
        Random r = new Random();

        for (int j = 0; j < tab.length; j++) {
            tab[j] = r.nextInt((maxWartosc - minWartosc) + 1) + minWartosc;
        }

        // return (int) ((Math.random() * (max - min)) + min);
    }

    public static int ileNieparzystych(int tab[]) {
        int count = 0;

        for (int j = 0; j < tab.length; j++) {
            if(tab[j] % 2 != 0) count++;
        }

        return count;
    }

    public static int ileParzystych(int tab[]) {
        int count = 0;

        for (int j = 0; j < tab.length; j++) {
            if(tab[j] % 2 == 0) count++;
        }

        return count;
    }

    public static int ileDodatnich(int tab[]) {
        int count = 0;

        for (int j = 0; j < tab.length; j++) {
            if(tab[j] > 0) count++;
        }

        return count;
    }

    public static int ileUjemnych(int tab[]) {
        int count = 0;

        for (int j = 0; j < tab.length; j++) {
            if(tab[j] < 0) count++;
        }

        return count;
    }

    public static int ileZerowych(int tab[]) {
        int count = 0;

        for (int j = 0; j < tab.length; j++) {
            if(tab[j] == 0) count++;
        }

        return count;
    }

    public static int ileMaksymalnych(int tab[]) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] > max) {
                max = tab[i];
            }
        }

        for (int i = 0; i < tab.length; i++) {
            if (tab[i] == max) {
                count++;
            }
        }

        return count;
    }

    public static int sumaDodatnich(int tab[]) {
        int sum = 0;

        for (int j = 0; j < tab.length; j++) {
            if(tab[j] > 0) sum += tab[j];
        }

        return sum;
    }

    public static int sumaUjemnych(int tab[]) {
        int sum = 0;

        for (int j = 0; j < tab.length; j++) {
            if(tab[j] < 0) sum += tab[j];
        }

        return sum;
    }

    public static int dlugoscMaksymalnegoCiaguDodatnich(int tab[]) {
        int length = 0;

        ArrayList<Integer> lengths = new ArrayList<Integer>();

        for(int j = 0; j < tab.length; j++) {
            if(tab[j] > 0) {
                length++;
            } else {
                lengths.add(length);
                length = 0;
            }
        }

        Collections.sort(lengths);

        return lengths.get(lengths.size() - 1);
    }

    public static void signum(int tab[]) {
        for (int j = 0; j < tab.length; j++) {
            if (tab[j] > 0) {
                tab[j] = 1;
            } else if(tab[j] < 0) {
                tab[j] = -1;
            }
        }
    }

    public static void odwrocFragment(int tab[], int lewy, int prawy) {
        // System.out.println("orginal" + Arrays.toString(tab));
        int tmp;

        while (prawy > lewy) {
            tmp = tab[prawy];
            tab[prawy] = tab[lewy];
            tab[lewy] = tmp;
            prawy--;
            lewy++;
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Liczba całkowita >= 1 && <= 100");
        int count = userInput.nextInt();

        while(count < 1 || count > 100) {
            System.out.println("Liczba całkowita >= 1 && <= 100");
            count = userInput.nextInt();
        }

        userInput.close();

        int[] arr = new int[count];

        generuj(arr, count, -999, 999);

        System.out.println(Arrays.toString(arr));

        int parzyste = ileParzystych(arr);
        System.out.println("Parzyste: " + parzyste);

        int nieparzyste = ileNieparzystych(arr);
        System.out.println("Nieparzyste: " + nieparzyste);

        int dodatnie = ileDodatnich(arr);
        System.out.println("Dodatnie: " + dodatnie);

        int ujemne = ileUjemnych(arr);
        System.out.println("Ujemne: " + ujemne);

        int zerowe = ileZerowych(arr);
        System.out.println("Zerowe: " + zerowe);

        int maksymalne = ileMaksymalnych(arr);
        System.out.println("Maksymalne: " + maksymalne);

        int sumaPlus = sumaDodatnich(arr);
        System.out.println("Suma dodatnich: " + sumaPlus);
        
        int sumaMinus = sumaUjemnych(arr);
        System.out.println("Suma ujemnych: " + sumaMinus);

        int dlugoscCiaguDodatnich = dlugoscMaksymalnegoCiaguDodatnich(arr);
        System.out.println("Dlugosc max ciagu dodatnich: " + dlugoscCiaguDodatnich);

        signum(arr);
        System.out.println("signum" + Arrays.toString(arr));

        odwrocFragment(arr, 1, 5);
        System.out.println("poodwroceniu" + Arrays.toString(arr));
    }
}
