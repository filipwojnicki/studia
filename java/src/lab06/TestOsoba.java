package lab06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;

public class TestOsoba {

  public static void main(String[] args) {
    ArrayList<Osoba> grupa = new ArrayList<Osoba>(){
      {
        add(new Osoba("Kowalski", LocalDate.of(1999, 5, 12)));
        add(new Osoba("Kowalski", LocalDate.of(1998, 5, 12)));
        add(new Osoba("Nowak", LocalDate.of(1999, 5, 12)));
        add(new Osoba("Test", LocalDate.of(1999, 5, 12)));
        add(new Osoba("asd", LocalDate.of(1999, 6, 12)));
      }
    };

    System.out.println(Arrays.toString(grupa.toArray()));

    Collections.sort(grupa, new Comparator<Osoba>() {
      @Override
      public int compare(Osoba poprzednia, Osoba aktualna) {
        return poprzednia.getDataUrodzenia().getYear() > aktualna.getDataUrodzenia().getYear() ? -1 : (poprzednia.getDataUrodzenia().getYear() < aktualna.getDataUrodzenia().getYear()) ? 1 : 0;
      }
    });

    System.out.println(Arrays.toString(grupa.toArray()));
  }
}
