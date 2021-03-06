package lab06.pary;

import java.util.ArrayList;

public class TestPara
{
    public static void main(String[] args)
    {
        String[] words = { "Ala", "ma", "psa", "i", "kota" };
        Pair<String> mm = ArrayAlg.minmax(words);
        System.out.println("min = " + mm.getFirst());
        System.out.println("max = " + mm.getSecond());
        mm = mm.swap();

        System.out.printf("First=" + mm.getFirst(), "Second=" + mm.getSecond());

        Integer[] sorted = new Integer[]{1, 2, 3, 4, 5, 6};
        Integer[] unsorted = new Integer[]{6, 4, 5, 1, 2, 3};

        System.out.print("\n");

        System.out.println(ArrayUtil.isSorted(sorted));
        System.out.println(ArrayUtil.isSorted(unsorted));

        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(1);
        test.add(2);

        ArrayList<Integer> test1 = new ArrayList<Integer>();
        ArrayList<Integer> test2 = new ArrayList<Integer>();

        test1 = ArrayUtil.copy(test);
        test2 = ArrayUtil.copy(test);

        System.out.println(ArrayUtil.copy(test1));
        System.out.println(ArrayUtil.copyDup(test2));

        System.out.println(ArrayUtil.binSearch(sorted, 3));
    }
}

class ArrayUtil {
  public static <T extends Comparable<T>> boolean isSorted(T[] array) {
    for (int i = 0; i < array.length - 1; i++){
      if (array[i + 1].compareTo(array[i]) < 0) {
        return false;
      }
    }

    return true;
  }

  public static <T> ArrayList copy(ArrayList<? extends T> array) {
    ArrayList<? extends T> copiedArr = array;
    return copiedArr;
  }

  public static <T> ArrayList copyDup(ArrayList<? super T> array) {
    ArrayList<? super T> copiedArr = array;
    return copiedArr;
  }

  public static <T extends Comparable<T>> int binSearch(T[] array, T value) {
    int low = 0;
    int high = array.length - 1;

    while (low <= high) {
        int mid = (low + high) / 2;
        int result = value.compareTo(array[mid]);

        if      (result < 0) high = mid - 1;
        else if (result > 0) low = mid + 1;
        else return mid;
    }

    return -1;
  }
}

class ArrayAlg
{

    public static Pair<String> minmax(String[] a)
    {
        if (a == null || a.length == 0) {
            return null;
        }

        String min = a[0];
        String max = a[0];

        for (int i = 1; i < a.length; i++) {
            if (min.compareTo(a[i]) > 0) {
                min = a[i];
            }

            if (max.compareTo(a[i]) < 0) {
                max = a[i];
            }
        }

        return new Pair<String>(min, max);
    }
}

