package lab06.pary;

public class Pair<T> {
    /*
    public Pair()
    {
        first = null;
        second = null;
    }
    */

    public Pair(T first, T second){ this.first = first; this.second = second; }

    public Pair<T> swap() {
      return new Pair(second, first);
    }

    public Pair<T> swapUtil(Pair pair) {
      return new Pair(pair.getSecond(), pair.getFirst());
    }
    
    public T getFirst() { return first; }
    public T getSecond() { return second; }

    public void setFirst(T newValue) { first = newValue; }
    public void setSecond(T newValue) { second = newValue; }

    private T first;
    private T second;
}
