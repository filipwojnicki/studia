package lab02.napisy;

public class zad1f {
    public static void main(String[] args) {
        System.out.println(change("miDDle"));
    }

    static String change(String str) {
        StringBuffer result = new StringBuffer();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if(Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if(Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        return result.toString();
    }
}
