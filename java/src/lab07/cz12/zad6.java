package lab07.cz12;

import java.util.ArrayList;
import java.util.LinkedList;

public class zad6 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("asd");
    list.add("vxzvz");
    list.add("ghgh");

    print(list);

    LinkedList<String> linkedList = new LinkedList<String>();

    linkedList.add("asd");
    linkedList.add("vxzvz");
    linkedList.add("ghgh");

    print(linkedList);
  }

  public static <E, I extends Iterable<E>> void print(I iterable) {
    ArrayList<String> stringList = new ArrayList<>();
    for(E element: iterable) {
        stringList.add(element.toString());
    }
    String result = String.join(",", stringList);
    System.out.println(result);
  }
}
