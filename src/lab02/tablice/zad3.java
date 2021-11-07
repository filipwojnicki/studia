package lab02.tablice;

import java.util.Scanner;

public class zad3 {
    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
      }

    public static int[][] generateMatrix(int x, int y) {
        int[][] matrix = new int[x][y];

        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                matrix[i][j] = getRandomNumber(0, 10);
            }
        }

        return matrix;
    }

    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] matrixC = new int[matrixA.length][matrixB[0].length];

        for(int i = 0; i < matrixA[i].length; i++) {
            for(int j = 0; j < matrixB.length; j++) {
                matrixC[i][j] = matrixA[i][j] * matrixB[i][j];
            }
        }

        return matrixC;
    }

    public static void printMatrix(int[][] matrix) {
        for(int x = 0; x < matrix.length; x++) {
            System.out.print("\n");

            for(int y = 0; y < matrix[x].length; y++) {
                System.out.print(matrix[x][y] + ", ");
            }
        }

        System.out.print("\n");
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("m - Liczba całkowita [1;10]:");
        int m = userInput.nextInt();

        while(m < 1 || m > 10) {
            System.out.println("m - Liczba całkowita [1;10]:");
            m = userInput.nextInt();
        }

        System.out.println("n - Liczba całkowita [1;10]:");
        int n = userInput.nextInt();

        while(n < 1 || n > 10) {
            System.out.println("n - Liczba całkowita [1;10]:");
            n = userInput.nextInt();
        }

        System.out.println("k - Liczba całkowita [1;10]:");
        int k = userInput.nextInt();

        while(k < 1 || k > 10) {
            System.out.println("k - Liczba całkowita [1;10]:");
            k = userInput.nextInt();
        }

        int[][] matrixA = generateMatrix(m,n);
        System.out.println("Macierz A: ");
        printMatrix(matrixA);

        int[][] matrixB = generateMatrix(n,k);
        System.out.println("Macierz B: ");
        printMatrix(matrixB);

        int[][] matrixC = multiplyMatrix(matrixA, matrixB);
        System.out.println("Macierz C: ");
        printMatrix(matrixC);
    }
}
