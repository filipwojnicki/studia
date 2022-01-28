package lab06.osoby;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.time.LocalDate;

public class TestStudent {

  public static void main(String[] args) {
    ArrayList<Student> grupa = new ArrayList<Student>(){
      {
        add(new Student("Kowalski", LocalDate.of(1999, 5, 12), 4.5));
        add(new Student("Kowalski", LocalDate.of(1998, 5, 12), 3.2));
        add(new Student("Nowak", LocalDate.of(1997, 5, 12), 2.3));
        add(new Student("Test", LocalDate.of(1996, 5, 12), 5.2));
        add(new Student("asd", LocalDate.of(1999, 6, 12), 1.2));
      }
    };

    System.out.println(Arrays.toString(grupa.toArray()));

    Collections.sort(grupa, new Comparator<Student>() {
      @Override
      public int compare(Student poprzednia, Student aktualna) {
        return poprzednia.getDataUrodzenia().getYear() > aktualna.getDataUrodzenia().getYear() ? -1 : (poprzednia.getDataUrodzenia().getYear() < aktualna.getDataUrodzenia().getYear()) ? 1 : 0;
      }
    });

    System.out.println(Arrays.toString(grupa.toArray()));
  }
}
