package lab04.z07;

public class zad3 {
  public static void main(String[] args) {
    Nauczyciel n = new Nauczyciel("Kowalski", 1990, 5000);
    Nauczyciel ncopy = new Nauczyciel("Kowalski", 1990, 5000);

    System.out.println(n.toString());
    System.out.println("Rok urodzenia: " + n.getRokUrodzenia());

    if(n.equals(ncopy)) {
      System.out.println("Ten sam nauczyciel");
    }

    Osoba osoba = new Osoba("Kowalski", 1990);
    Osoba nowaOsoba = new Osoba("Kowalski", 1990);

    System.out.println(osoba.toString());
    System.out.println("Nazwisko: " + osoba.getNazwisko());

    if(osoba.equals(nowaOsoba)) {
      System.out.println("Ta sama osoba");
    }

    Student student = new Student("Kowalski", 1990, "informatyka");
    Student nowyStudent = new Student("Kowalski", 1990, "informatyka");

    System.out.println(student.toString());
    System.out.println("Kierunek: " + student.getKierunek());

    if(student.equals(nowyStudent)) {
      System.out.println("Ten sam student");
    }
  }
}
