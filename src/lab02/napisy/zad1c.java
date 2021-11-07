package lab02.napisy;

public class zad1c {
    public static void main(String[] args) {
        System.out.println(middle("middle"));
    }

    static String middle(String str) {
        String result = "";

        int strLength = str.length();

        if(strLength % 2 == 0) {
            result += Character.toString(str.charAt(strLength / 2 - 1));
            result += Character.toString(str.charAt(strLength / 2));
        } else {
            result = Character.toString(str.charAt(strLength / 2));
        }

        return result;
    }
}
