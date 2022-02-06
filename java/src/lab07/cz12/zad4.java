package lab07.cz12;

import java.util.LinkedList;

public class zad4 {
  public static void main(String[] args) {
    LinkedList<Integer> lista = new LinkedList<Integer>();

    lista.add(1);
    lista.add(2);
    lista.add(3);
    lista.add(4);

    odwroc(lista);

    System.out.println(lista);
  }

  public static <T> void odwroc(LinkedList<T> lista) {
    LinkedList<T> tempList = new LinkedList<T>();
    tempList = (LinkedList) lista.clone();
    lista.clear();

    for (int i = tempList.size() - 1; i >= 0; i--) {
      lista.add(tempList.get(i));
    }
  }
}
