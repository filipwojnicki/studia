package zpj.lab02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

class ArrayListComparator implements Comparator<String> {
  @Override
  public int compare(String o1, String o2) {
    return o1.compareTo(o2);
  }
}

public class zad8 {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("a");
    strings.add("c");
    strings.add("b");
    strings.add("d");


    luckySort(strings, new ArrayListComparator()); 
  }

  static void luckySort(ArrayList<String> strings, Comparator<String> comp) {
    while(!isSorted(strings, comp)) {
      Collections.shuffle(strings);
      System.out.println(Arrays.deepToString(strings.toArray()));
    }
  }

  public static boolean isSorted(ArrayList<String> strings, Comparator<String> comp) {
    if (strings.size() <= 1) {
      return true;
    }

    Iterator<String> iter = strings.iterator();
    String current, previous = iter.next();
    while (iter.hasNext()) {
        current = iter.next();
        if (comp.compare(previous, current) > 0) {
            return false;
        }
        previous = current;
    }
    return true;
  }

}
