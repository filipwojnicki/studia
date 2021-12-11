package lab03.arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class lab04 {
  public static ArrayList<Integer> append(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> result = new ArrayList<Integer>();

    for(int i = 0; i < a.size(); i++) {
      result.add(a.get(i));
    }

    for(int i = 0; i < b.size(); i++) {
      result.add(b.get(i));
    }

    return result;
  }

  public static ArrayList<Integer> merge(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> result = new ArrayList<Integer>();

    int smallerSize = (a.size() < b.size() ? a.size() : b.size());

    for(int i = 0; i < smallerSize; i++) {
      result.add(a.get(i));
      result.add(b.get(i));
    }

    for(int j = smallerSize; j < (a.size() > b.size() ? a.size() : b.size()); j++) {
      result.add((a.size() > b.size() ? a.get(j) : b.get(j)));
    }

    return result;
  }

  public static ArrayList<Integer> mergeSorted(ArrayList<Integer> a, ArrayList<Integer> b) {
    ArrayList<Integer> result = merge(a, b);
    Collections.sort(result);
    return result;
  }

  public static void main(String[] args) {
    ArrayList<Integer> a = new ArrayList<Integer>();
    ArrayList<Integer> b = new ArrayList<Integer>();

    a.add(1);
    a.add(2);
    a.add(3);

    b.add(1);
    b.add(2);
    b.add(3);
    b.add(4);

    System.out.println("Append: " + Arrays.toString(append(a, b).toArray()));
    System.out.println("Merge: " + Arrays.toString(merge(a, b).toArray()));
  }
}
