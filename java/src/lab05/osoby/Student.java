package lab05.osoby;

public class Student extends Osoba{
  public Student(String nazwisko, String[] imiona, boolean plec, int rok, int miesiac, int dzien, String kierunek, double sredniaOcen) {
    super(nazwisko, imiona, plec, rok, miesiac, dzien);
    this.kierunek = kierunek;
    this.sredniaOcen = sredniaOcen;
  }

  public String getOpis() { return "kierunek studiów: " + kierunek; }

  public double getSredniaOcen() { return sredniaOcen; }
  public void setSredniaOcen(double srednia) { this.sredniaOcen = srednia; }

  private String kierunek;
  private double sredniaOcen;
}
