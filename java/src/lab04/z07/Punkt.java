package lab04.z07;

public class Punkt {
    Punkt(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    public void show()
    {
        System.out.println("<" + x + ", " + y + ">");
    }

    public int x()
    {
        return x;
    }

    public int y()
    {
        return y;
    }

    @Override
    public boolean equals(Object obj) {
      return true;
    }

    private int x, y;
}
