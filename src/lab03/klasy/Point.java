package lab03.klasy;

public final class Point {
  private final double x;
  private final double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public Point translate(int dirX, int dirY) {
    return new Point(x + dirX, y + dirY);
  }

  public Point scale(double s) {
    return new Point(x * s, y * s);
  }

  public double getX() { return x; }
  public double getY() { return y; }
}
