package lab03;

public class zad1a {
    public static void main(String[] args) {
        System.out.println(countChar("aaaasd", 'a'));
    }

    static int countChar(String str, char c) {
        int count = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == c) count++;
        }

        return count;
     }
}
