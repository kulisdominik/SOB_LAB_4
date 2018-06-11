package Factorial;

public class FactorialIteratively implements Runnable {
    private int score;
    private int range;
    private Thread thread = null;

    public FactorialIteratively(int range) {
        this.range = range;
    }

    @Override
    public void run() {
        if(thread == null)
        {
            thread = new Thread (this, "FactorialIteratively");
            thread.start();

            score = this.calculate(range);
        }
    }

    private int calculate(int value) {
        if(value == 0) {
            return 0;
        } else {
            int  temp = 1;
            while(value > 0) {
                temp *= value;
                --value;
            }
            return temp;
        }
    }

    public void join() throws InterruptedException {
        thread.join();
    }

    public int getScore() {
        return score;
    }
}
