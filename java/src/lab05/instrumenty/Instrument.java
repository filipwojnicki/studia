package lab05.instrumenty;

import java.time.LocalDate;

public abstract class Instrument {
  private String producent;
  private LocalDate rokProdukcji;

  abstract void dzwiek();

  Instrument(String producent, LocalDate rokProdukcji) {
    this.producent = producent;
    this.rokProdukcji = rokProdukcji;
  }

  public String getProducent() { return producent; }
  public LocalDate getRokProdukcji() { return rokProdukcji; }

  @Override
  public boolean equals(Object obj) {
    if(!(obj instanceof Instrument)) {
      return false;
    }

    Instrument instrument = (Instrument) obj;

    return (this.producent == instrument.getProducent() && this.rokProdukcji == instrument.getRokProdukcji());
  }

  @Override
  public String toString() { 
    return "Producent: " + this.producent + ",rok produkcji: " + this.rokProdukcji;
  }
}
