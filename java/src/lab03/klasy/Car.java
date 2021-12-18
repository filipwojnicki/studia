package lab03.klasy;

public class Car {
  private double currentDistance;
  private double fuelCount;
  private double consumption;

  private int fuelConsumptionPerKilometerCount = 100;

  public  Car(double consumption) {
    this.consumption = consumption;

    this.currentDistance = 0;
    this.fuelCount = 0;
  }

  void moveDistance(double distance) {
    double fuelEfficiency = (distance / fuelConsumptionPerKilometerCount) * consumption;
    fuelCount -= fuelEfficiency;

    if(fuelCount < 0) {
      fuelCount += fuelEfficiency;
      return;
    }

    currentDistance += distance;
  }

  void setFuelCount(double count) { fuelCount = count; }

  double getFuelCount() { return fuelCount; }
  double getCurrentDistance() { return currentDistance; }
} 
