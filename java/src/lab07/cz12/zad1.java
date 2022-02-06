package lab07.cz12;

import java.util.LinkedList;

public class zad1 {
  public static void main(String[] args) {
    LinkedList<String> pracownicy = new LinkedList<String>();

    pracownicy.add("Nowak");
    pracownicy.add("Kowalski");
    pracownicy.add("Kowal");
    pracownicy.add("Nowa");
    pracownicy.add("Nowa2");
    pracownicy.add("Nowa3");
    
    System.out.println(pracownicy);

    redukuj(pracownicy, 2);

    System.out.println(pracownicy);
  }

  public static void redukuj(LinkedList<String> pracownicy, int n) {
    for (int i = pracownicy.size() - 1; i >= 0; i--) {
      if(i % n == 0) {
        pracownicy.remove(pracownicy.get(i));
      }
    }
  }
}
