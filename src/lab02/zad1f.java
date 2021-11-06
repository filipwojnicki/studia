package lab02;

public class zad1f {
    public static void main(String[] args) {
        System.out.println(change("miDDle"));
    }

    static String change(String str) {
        String result = "";

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if(Character.isUpperCase(c)) {
                result += Character.toLowerCase(c);
            } else if(Character.isLowerCase(c)) {
                result += Character.toUpperCase(c);
            } else {
                result += c;
            }
        }

        return result;
    }
}
