package lab04.z07;

public class Student extends Osoba {
  private String kierunek;

  public Student(String nazwisko, int rokUrodzenia, String kierunek) {
    super(nazwisko, rokUrodzenia);
    this.kierunek = kierunek;
  }

  public String getKierunek() { return this.kierunek; }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Student)) {
      return false;
    }

    Student student = (Student) obj;

    return (this.nazwisko == student.getNazwisko() && this.rokUrodzenia == student.getRokUrodzenia() && this.kierunek == student.getKierunek());
  }

  @Override
  public String toString() { 
    return "Nazwisko: " + this.nazwisko + ",rok urodzenia " + this.rokUrodzenia + ",kierunek " + this.kierunek;
  }
  
}
