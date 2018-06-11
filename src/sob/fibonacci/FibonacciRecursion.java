package sob.fibonacci;

public class FibonacciRecursion implements Runnable {
    private int score;
    private int range;
    private Thread thread = null;

    public FibonacciRecursion(int range) {
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

    private int calculate(int value) {
        if (value == 0) {
            return 0;
        } else if (value == 1) {
            return 1;
        } else {
            return calculate(value - 1) + calculate(value - 2);
        }
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    public int getScore() {
        return score;
    }
}
