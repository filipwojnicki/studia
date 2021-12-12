package lab04.z07;

public class Osoba {
  protected String nazwisko;
  protected int rokUrodzenia;

  public Osoba(String nazwisko, int rokUrodzenia) {
    this.nazwisko = nazwisko;
    this.rokUrodzenia = rokUrodzenia;
  }

  public String getNazwisko() { return this.nazwisko; }
  public int getRokUrodzenia() { return this.rokUrodzenia; }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Osoba)) {
      return false;
    }

    Osoba osoba = (Osoba) obj;

    return (this.nazwisko == osoba.getNazwisko() && this.rokUrodzenia == osoba.getRokUrodzenia());
  }

  @Override
  public String toString() { 
    return "Nazwisko: " + this.nazwisko + ",rok urodzenia " + this.rokUrodzenia;
  }
}
