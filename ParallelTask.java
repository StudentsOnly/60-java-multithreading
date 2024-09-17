public class ParallelTask implements Runnable {

  private long n;

  public ParallelTask(long n) {
    this.n = n;
  }

  @Override
  public void run() {
    long factorial1 = factorial(n);
    System.out.println(Thread.currentThread().getName() + " Factorial " + n + ": " + factorial1);
  }

  private long factorial(long n) {
    long result = 1;
    for (long i = n; i >= 1; i--) {
      System.out.println(Thread.currentThread().getName() + " i: " + i);
      result *= i;
    }
    return result;
  }
}
