package lab03.klasy;

import lab03.klasy.Point;

public class zad5 {
  public static void main(String[] args) {
    Point p = new Point(3, 4).translate(1, 3).scale(0.5);
    System.out.println("X = " + p.getX() + ", Y = " + p.getY());
  }
}
