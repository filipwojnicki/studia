package lab05.instrumenty;

import java.util.ArrayList;
import java.util.Arrays;
import java.time.LocalDate;

public class TestInstrumenty {
  public static void main(String[] args) {
    ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
    orkiestra.add(
      new Flet("producent 1", LocalDate.of(2000, 1, 1))
    );
    orkiestra.add(
      new Skrzypce("producent 2", LocalDate.of(2001, 1, 1))
    );
    orkiestra.add(
      new Flet("producent 3", LocalDate.of(2003, 1, 1))
    );
    orkiestra.add(
      new Fortepian("producent 4", LocalDate.of(2004, 1, 1))
    );
    orkiestra.add(
      new Skrzypce("producent 5", LocalDate.of(2005, 1, 1))
    );

    for(Instrument i : orkiestra) {
      i.dzwiek();
    }

    System.out.println(Arrays.toString(orkiestra.toArray()));
  }
}
