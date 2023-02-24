/**
 *
 * @author jojo Johanna I. Scharbaai-Emilien
 *
 */
public class FibonacciRecursion {
    static int numA = 0;
    static int numB = 1;
    /**
     * This is the method that will perform the Fibonacci sequence
     * in recursion.
     * @param n2 represents the number of iterations in the sequence, 15 total
     *
     */
    static void printFb(int n2){  // Parameter is the number of iterations (15)
        if (n2 > 0) {
            int numC = numA + numB;
            numA = numB;
            numB = numC;
            System.out.print(" " + numC);
            printFb(n2 - 1);   // Recursion
        }
    }
}