/**
 *
 * @author jojo Johanna I. Scharbaai-Emilien
 *
 */
public class FibonacciRecursion {
    static int numA = 0;
    static int numB = 1;
    /**
     * This is the class that will perform the Fibonacci sequence
     * in recursion.
     *
     */
    static void printFb(int n2){  // Parameter is the number of iterations (15)
        /*
          The method executes the Fibonacci sequence in
          recursion.
         */
        if (n2 > 0) {
            int numC = numA + numB;
            numA = numB;
            numB = numC;
            System.out.print(" " + numC);
            printFb(n2 - 1);   // Recursion
        }
    }
}