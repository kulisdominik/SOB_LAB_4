import FS.FibonacciRecursion;
import Factorial.FactorialIteratively;

public class Main {
    private static int N = 12;

    public static void main(String[] args) {
        FibonacciRecursion fibonacciRecursion = new FibonacciRecursion(N);

        FactorialIteratively factorialIteratively = new FactorialIteratively(N);



        fibonacciRecursion.run();

        factorialIteratively.run();


        try {
            fibonacciRecursion.join();
            factorialIteratively.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(fibonacciRecursion.getScore());
        System.out.println(factorialIteratively.getScore());
    }
}
