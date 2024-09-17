public class ParallelTaskExercise {
    public static void main(String[] args) {
        Thread task1 = new Thread(new ParallelTask(25), "Thread for number 25");
        Thread task2 = new Thread(new ParallelTask(15), "Thread for number 15");
        Thread task3 = new Thread(new ParallelTask(20), "Thread for number 20");

        System.out.println("Starting thread for number 25");
        task1.start();
        System.out.println("Starting thread for number 15");
        task2.start();
        System.out.println("Starting thread for number 20");
        task3.start();


        System.out.println("Checking threads");
        waitForTask(task1);
        waitForTask(task2);
        waitForTask(task3);

        System.out.println("Main thread exiting.\n");
    }

    private static void waitForTask(Thread thread) {
        if (thread.isAlive()) {
            System.out.println("Waiting " + thread.getName());
            try {
                thread.join();
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        } else System.out.println(thread.getName() + " is not alive");
    }
}
