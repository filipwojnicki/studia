package lab02;

import java.util.ArrayList;
import java.util.Arrays;

public class zad1e {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(where("Hello world world", "world")));
    }

    static int[] where(String str, String subStr) {
        ArrayList<Integer> positions = new ArrayList<Integer>();
        int strLength = subStr.length();

        int index = 0;

        while(true) {
            index = str.indexOf(subStr, index == 0 ? 0 : index + strLength);

            if(index == -1) {
                break;
            }

            positions.add(index);
        }

        int[] result = new int[positions.size()];

        for(int i = 0; i < positions.size(); i++) {
            result[i] = positions.get(i);
        }

        return result;
    }
}
