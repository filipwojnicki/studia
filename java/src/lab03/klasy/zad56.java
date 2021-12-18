package lab03.klasy;

public class zad56 {
  public static void main(String[] args) {
    Point p = new Point(3, 4).translate(1, 3).scale(0.5);
    System.out.println("X = " + p.getX() + ", Y = " + p.getY());

    p.translateModify(2,4);
    p.scaleModify(0.5);
    System.out.println("X = " + p.getX() + ", Y = " + p.getY());
  }
}
