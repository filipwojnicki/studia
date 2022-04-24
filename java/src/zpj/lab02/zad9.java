package zpj.lab02;

class Greeter implements Runnable {  
  private int target;
  private int n;

  public Greeter(int target, int n) {
    this.target = target;
    this.n = n;
  }

  @Override
  public void run() {
    for(int i=0; i<n; i++) {
      System.out.println("Witaj " + target);
    }
  }
}

public class zad9 {
  public static void main(String[] args) {
      int n = 2;

      Runnable[] runners = new Runnable[n];
  		Thread[] threads = new Thread[n];
  
  		for(int i=0; i<n; i++) {
  			runners[i] = new Greeter(i, n);
  		}
  
  		for(int i=0; i<n; i++) {
  			threads[i] = new Thread(runners[i]);
  		}
  
  		for(int i=0; i<n; i++) {
  			threads[i].start();
  		}

      System.out.println("runTogether");
      runTogether(runners);

      System.out.println("runInOrder");
      runInOrder(runners);
  }

  public static void runTogether(Runnable... tasks) {
    Thread[] threads = new Thread[tasks.length];

    for (int i=0; i<tasks.length; i++) {
      threads[i] = new Thread(tasks[i]);
    }

    for(int i=0; i<tasks.length; i++) {
      threads[i].start();
    }
  }

  public static void runInOrder(Runnable... tasks) {
    for(int i=0; i<tasks.length; i++) {
      tasks[i].run();
    }
  }
}
