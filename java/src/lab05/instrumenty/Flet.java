package lab05.instrumenty;

import java.time.LocalDate;

public class Flet extends Instrument {
  Flet(String producent, LocalDate rokProdukcji) {
    super(producent, rokProdukcji);
  }

  @Override
  void dzwiek() {
    System.out.println("flet");
  }
  
}
