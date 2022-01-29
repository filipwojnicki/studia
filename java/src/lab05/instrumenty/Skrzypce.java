package lab05.instrumenty;

import java.time.LocalDate;

public class Skrzypce extends Instrument{
  Skrzypce(String producent, LocalDate rokProdukcji) {
    super(producent, rokProdukcji);
  }

  @Override
  void dzwiek() {
    System.out.println("Skrzypce");
  }
}
