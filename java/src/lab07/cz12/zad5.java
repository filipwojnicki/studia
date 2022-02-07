package lab07.cz12;

import java.util.ArrayList;
import java.util.Iterator;

public class zad5 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();

    list.add("asd");
    list.add("vxzvz");
    list.add("ghgh");

    System.out.println(list);

    upperCaseLoop((ArrayList) list.clone());
    upperCaseIterator((ArrayList) list.clone());
    upperCaseReplaceAll((ArrayList) list.clone());
  }

  public static void upperCaseLoop(ArrayList<String> list) {
    for (String str: list) {
      String newValue = str.toUpperCase();
      list.set(list.indexOf(str), newValue);
    }

    System.out.println("loop: "+ list);
  }

  public static void upperCaseIterator(ArrayList<String> list) {
    Iterator<String> iter = list.iterator();

    while (iter.hasNext()) {
      String str = iter.next();
      String newValue = str.toUpperCase();
      list.set(list.indexOf(str), newValue);
    }

    System.out.println("iterator: "+ list);
  }

  public static void upperCaseReplaceAll(ArrayList<String> list) {
    list.replaceAll( e -> e.toUpperCase() );
    System.out.println("replace all: "+ list);
  }
}
