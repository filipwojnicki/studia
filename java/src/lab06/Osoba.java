package lab06;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Osoba implements Cloneable, Comparable<Osoba> {
  private String nazwisko;
  private LocalDate dataUrodzenia;

  Osoba(String nazwisko, LocalDate dataUrodzenia) {
    this.nazwisko = nazwisko;
    this.dataUrodzenia = dataUrodzenia;
  }

  public String getNazwisko() {  return nazwisko; }
  public LocalDate getDataUrodzenia() { return dataUrodzenia; }

  @Override
  public boolean equals(Object obj) {
    if(this.getClass() != obj.getClass()) {
      return false;
    }

    Osoba os = (Osoba) obj;

    return (this.nazwisko == os.getNazwisko() && this.dataUrodzenia.equals(os.getDataUrodzenia()));
  }

  @Override
  public String toString() {
    LocalDate date = this.dataUrodzenia;
    DateTimeFormatter formatters = DateTimeFormatter.ofPattern("uuuu-MM-dd"); // yyyy-MM-dd
    return this.getClass().getName() + "[" + this.nazwisko + "," + date.format(formatters)  + "]";
  }

  @Override
  protected Object clone() throws CloneNotSupportedException {
    return super.clone();
  }

  @Override
  public int compareTo(Osoba o) {
    if(this.getNazwisko() == o.getNazwisko() && this.getDataUrodzenia().equals(o.getDataUrodzenia())) {
      return 0;
    }

    return 1;
  }
}
