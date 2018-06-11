package sob;

import sob.factorial.FactorialRecursion;
import sob.fibonacci.FibonacciRecursion;
import sob.factorial.FactorialIteratively;
import sob.fibonacci.FibonacciSeries;

public class Main {
    private static final int N = 12;

    public static void main(String[] args) throws InterruptedException {

        final FibonacciRecursion fibonacciRecursion = new FibonacciRecursion(N);
        final FibonacciSeries fibonacciSeries = new FibonacciSeries(N);

        final FactorialIteratively factorialIteratively = new FactorialIteratively(N);
        final FactorialRecursion factorialRecursion = new FactorialRecursion(N);

        fibonacciRecursion.run();
        fibonacciSeries.run();
        factorialIteratively.run();
        factorialRecursion.run();

        fibonacciRecursion.join();
        fibonacciSeries.join();
        factorialIteratively.join();
        factorialRecursion.join();

        System.out.println("Fibonacci recursion:");
        System.out.println(fibonacciRecursion.getScore());
        System.out.println("Fibonacci series:");
        System.out.println(fibonacciSeries.getScore());

        System.out.println("Factorial iteratively:");
        System.out.println(factorialIteratively.getScore());
        System.out.println("Factorial recursion:");
        System.out.println(factorialRecursion.getScore());
    }
}
