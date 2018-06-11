package sob.fibonacci;

public class FibonacciSeries implements Runnable {
    private int score;
    private int range;
    private Thread thread = null;

    public FibonacciSeries(int range) {
        this.range = range;
    }

    @Override
    public void run() {
        if (thread == null) {
            thread = new Thread(this, "FibonacciRecursion");
            thread.start();

            score = this.calculate(range);
        }
    }

    private int calculate(int range) {

        int[] feb = new int[range + 1];
        feb[0] = 0;
        feb[1] = 1;
        for (int i = 2; i < range + 1; i++) {
            feb[i] = feb[i - 1] + feb[i - 2];
        }

        return feb[range];
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    public int getScore() {
        return score;
    }
}
