package lab02.napisy;

public class zad1b {
    public static void main(String[] args) {
        System.out.println(countSubstring("Hello world world", "world"));
    }

    static int countSubstring(String str, String subStr) {
        int count = 0;
        int strLength = subStr.length();

        int index = 0;

        while(true) {
            index = str.indexOf(subStr, index == 0 ? 0 : index + strLength);

            if(index == -1) {
                break;
            }

            count++;
        }

        return count;
    }
}
