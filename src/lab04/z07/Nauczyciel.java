package lab04.z07;

public class Nauczyciel extends Osoba {
  private int pensja;

  public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja) {
    super(nazwisko, rokUrodzenia);
    this.pensja = pensja;
  }

  public int getPensja() { return this.pensja; }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Nauczyciel)) {
      return false;
    }

    Nauczyciel nc = (Nauczyciel) obj;

    return (this.pensja == nc.getPensja() && this.nazwisko == nc.getNazwisko() && this.rokUrodzenia == nc.getRokUrodzenia());
  }

  @Override
  public String toString() { 
    return "Nazwisko: " + this.nazwisko + ",rok urodzenia " + this.rokUrodzenia + ",pensja " + this.pensja;
  }
}
