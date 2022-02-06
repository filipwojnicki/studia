package lab07.cz12;

import java.util.LinkedList;

public class zad2 {
  public static void main(String[] args) {
    LinkedList<Integer> pracownicy = new LinkedList<Integer>();

    pracownicy.add(1);
    pracownicy.add(2);
    pracownicy.add(3);
    pracownicy.add(4);
    pracownicy.add(5);
    
    System.out.println(pracownicy);

    redukuj(pracownicy, 2);

    System.out.println(pracownicy);
  }

  public static <T> void redukuj(LinkedList<T> pracownicy, int n) {
    for (int i = pracownicy.size() - 1; i >= 0; i--) {
      if(i % n == 0) {
        pracownicy.remove(i);
      }
    }
  }
}
