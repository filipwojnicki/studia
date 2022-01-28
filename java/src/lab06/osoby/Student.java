package lab06.osoby;

import java.time.LocalDate;

public class Student extends Osoba implements Cloneable, Comparable<Osoba> {
  private double sredniaOcen;

  Student(String nazwisko, LocalDate dataUrodzenia, double sredniaOcen) {
    super(nazwisko, dataUrodzenia);

    this.sredniaOcen = sredniaOcen;
  }

  double getSredniaOcen() { return sredniaOcen; }

  @Override
  public int compareTo(Osoba o) {
    if(this.getNazwisko() == o.getNazwisko() &&
       this.getDataUrodzenia().equals(o.getDataUrodzenia())) {
      return 0;
    }

    return 1;
  }
  
}