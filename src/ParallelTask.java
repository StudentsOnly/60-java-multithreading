public class ParallelTask implements Runnable {
    private int number;
    private long factorial = 1;

    public ParallelTask(int number) {
        this.number = number;
    }

    private void factorial() {
        for (int i = 1; i <= number; i++) {
            factorial *= i;
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("err");
            }
        }
        System.out.printf("\tFactorial of %d is %d\n", number, factorial);
    }

    @Override
    public void run() {
        factorial();
    }
}
