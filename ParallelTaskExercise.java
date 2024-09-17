public class ParallelTaskExercise {

  public static void main(String[] args) {

    Thread task1 = new Thread(new ParallelTask(4));
    Thread task2 = new Thread(new ParallelTask(3));
    Thread task3 = new Thread(new ParallelTask(2));

    System.out.println(task1.getName() + " is starting...");
    task1.start();
    System.out.println(task2.getName() + " is starting...");
    task2.start();
    System.out.println(task3.getName() + " is starting...");
    task3.start();

    try {
      System.out.println(task1.getName() + " is joining...");
      task1.join();
      System.out.println(task2.getName() + " is joining...");
      task2.join();
      System.out.println(task3.getName() + " is joining...");
      task3.join();
    } catch (InterruptedException e) {
      System.out.println("Thread interrupted: " + e);
    }
    System.out.println("Main thread exiting.\n");
  }
}
