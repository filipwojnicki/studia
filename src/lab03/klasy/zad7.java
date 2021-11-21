package lab03.klasy;

public class zad7 {
  public static void main(String[] args) {
    double fuelConsumption = 7.2;
    double fuelCount = 20;
    double distance = 200;

    Car car = new Car(fuelConsumption);

    car.setFuelCount(fuelCount);
    car.moveDistance(distance);
    car.moveDistance(distance - 150);

    System.out.println("FUEL: " + car.getFuelCount() + "L ,DISTANCE: " + car.getCurrentDistance() + "km");
  }
}
