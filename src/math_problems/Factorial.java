package math_problems;

public class Factorial {

    /** INSTRUCTIONS
     *
     * Write a method to return the Factorial of any given number using Recursion, and also another way, using iteration
     * I have not taught you recursion. Your job is to look it up, learn about it, and use it to find a solution.
     *
     * HINT: Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120
     */

    public static void main(String[] args) {

        System.out.println(factorial(7));
        System.out.println(getFactorialForLoop(5));

    }

    static int factorial (int n) {
        if (n == 0) {
            return 1;
        }
            return n * factorial(n - 1);
        }
public static int getFactorialForLoop(int n) {
    int result = 1;
    if (n > 1) {
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    } else {
        System.out.println("n has to be positive");
        return result;
    }
}
    }
