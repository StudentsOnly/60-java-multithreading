import java.util.ArrayList;

class ParallelTask implements Runnable {

    private int number;

    public ParallelTask(int number) {
        this.number = number;
    }

    private long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    @Override
    public void run() {
        try {
            System.out.println("Task started for number: " + number);
            Thread.sleep(1000);
            long result = factorial(number);
            System.out.println("Factorial of " + number + " is = " + result);
        } catch (InterruptedException e) {
            System.err.println("Task for number " + number + " was interrupted.");
        }
    }

}

public class ParallelTaskExercise {
    public static void main(String[] args) {

        Thread t1 = new Thread(new ParallelTask(5));
        Thread t2 = new Thread(new ParallelTask(10));
        Thread t3 = new Thread(new ParallelTask(15));

        ArrayList<Thread> threadList = new ArrayList<>();
        threadList.add(t1);
        threadList.add(t2);
        threadList.add(t3);

        threadList.forEach(thread -> thread.start());

        threadList.forEach(thread -> {
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println("Thread interrupted: " + e);
            }
        });

        System.out.println("Main thread exiting.\n");
    }
}
