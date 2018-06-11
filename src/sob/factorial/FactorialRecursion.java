package sob.factorial;

public class FactorialRecursion implements Runnable {
    private int score;
    private int range;
    private Thread thread = null;

    public FactorialRecursion(int range) {
        this.range = range;
    }

    @Override
    public void run() {
        if (thread == null) {
            thread = new Thread(this, "FactorialIteratively");
            thread.start();

            score = this.calculate(range);
        }
    }

    private int calculate(int range) {

        if (range == 0)
            return 1;
        else
            return (range * calculate(range - 1));
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    public int getScore() {
        return score;
    }
}
