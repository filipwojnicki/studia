package lab02;

public class zad1d {
    public static void main(String[] args) {
        System.out.println(repeat("middle", 5));
    }

    static String repeat(String str, int n) {
        String result = "";

        for(int i = 0; i < n; i++) {
            result += str;
        }

        return result;
    }
}
