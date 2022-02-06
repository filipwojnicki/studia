package lab07.cz12;

import java.util.LinkedList;

public class zad3 {
  public static void main(String[] args) {
    LinkedList<String> lista = new LinkedList<String>();

    lista.add("1");
    lista.add("2");
    lista.add("3");
    lista.add("4");

    odwroc(lista);

    System.out.println(lista);
  }

  public static void odwroc(LinkedList<String> lista) {
    LinkedList<String> tempList = new LinkedList<String>();
    tempList = (LinkedList) lista.clone();
    lista.clear();

    for (int i = tempList.size() - 1; i >= 0; i--) {
      lista.add(tempList.get(i));
    }
  }
}
