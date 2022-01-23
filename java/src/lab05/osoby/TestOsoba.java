package lab05.osoby;

public class TestOsoba{
    public static void main(String[] args) {
        Osoba[] ludzie = new Osoba[2];
        ludzie[0] = new Pracownik("Kowalski", new String[] {"Jan", "Pawel"}, false, 50000, 2020, 6, 7, 2020, 6, 7);
        ludzie[1] = new Student("Nowak", new String[] {"Malogrzata"}, true, 2020, 6, 7, "informatyka", 5.0);
        
        for (Osoba p : ludzie) {
            System.out.println(p.getNazwisko() + ": " + p.getOpis());
        }
    }
}
