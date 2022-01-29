package lab05.instrumenty;

import java.time.LocalDate;

public class Fortepian extends Instrument {
  Fortepian(String producent, LocalDate rokProdukcji) {
    super(producent, rokProdukcji);
  }

  @Override
  void dzwiek() {
    System.out.println("Fortepian");
  }
}
