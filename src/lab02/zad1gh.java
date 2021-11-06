package lab02;

public class zad1gh {
    public static void main(String[] args) {
        System.out.println(nice("miDDle", '"', 3));
    }

    static String nice(String str, char separator, int positionsCount) {
        StringBuffer result = new StringBuffer();
        StringBuffer temp = new StringBuffer();

        for(int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            temp.append((int) c);
        }

        temp.reverse();

        int i = 1;
        for(char c : temp.toString().toCharArray()) {
            result.append(c);

            if(i % positionsCount == 0) {
                result.append(separator);
            }

            i++;
        }

        return result.reverse().toString();
    }
}
