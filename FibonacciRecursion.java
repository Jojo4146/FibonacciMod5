public class FibonacciRecursion {
    // Start of Fibonacci sequence with recursion
    static int numA = 0;
    static int numB = 1;

    static void printFb(int n2){

        if (n2 > 0) {
            int numC = numA + numB;
            numA = numB;
            numB = numC;
            System.out.print(" " + numC);
            printFb(n2 - 1);
        }


    }

}