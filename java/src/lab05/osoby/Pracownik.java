package lab05.osoby;

import java.time.LocalDate;

public class Pracownik extends Osoba {
  public Pracownik(String nazwisko, String[] imiona, boolean plec, double pobory, int rok, int miesiac, int dzien, int rokZatrudnienia, int miesiacZatrudnienia, int dzienZatrudnienia) {
    super(nazwisko, imiona, plec, rok, miesiac, dzien);
    this.pobory = pobory;

    LocalDate dataZatrudnienia = LocalDate.of(rokZatrudnienia, miesiacZatrudnienia, dzienZatrudnienia);
    this.dataZatrudnienia = dataZatrudnienia;
  }

  public double getPobory() { return pobory; }
  public String getOpis() { return String.format("pracownik z pensją %.2f zł", pobory); }
  public LocalDate getDataZatrudnienia() { return dataZatrudnienia; }

  private double pobory;
  private LocalDate dataZatrudnienia;
}
