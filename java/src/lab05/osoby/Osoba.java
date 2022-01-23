package lab05.osoby;

import java.time.LocalDate;

public abstract class Osoba{
  public Osoba(String nazwisko, String[] imiona, boolean plec, int rok, int miesiac, int dzien) {
    this.nazwisko = nazwisko;
    this.imiona = imiona;
    this.plec = plec;

    LocalDate dataUrodzenia = LocalDate.of(rok, miesiac, dzien);
    this.dataUrodzenia = dataUrodzenia;
  }

  public abstract String getOpis();
  public String getNazwisko() { return nazwisko; }

  public String[] getImiona() { return imiona; }
  public boolean getPlec() { return plec; }
  public LocalDate getDataUrodzenia() { return dataUrodzenia; }

  private String nazwisko;
  protected String[] imiona;
  protected boolean plec;
  protected LocalDate dataUrodzenia;
}
