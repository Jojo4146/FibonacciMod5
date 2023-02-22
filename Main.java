public class Main {
    public static void main(String[] args){
        // Variables
        int num1 = 0;
        int num2 = 1;
        int num3;
        int i;
        int n = 15;

        // Start of table creation
        System.out.println("\t\tImplementing Fibonacci function in recursive & iterative fashion");
        System.out.println("==============================================================================");
        System.out.print("Non-Recursive  |  ");
        long startTime1 = System.nanoTime(); // Start time calculation

        // Start of calculations of non-recursive calcs for Fibonacci sequence
        System.out.print(num1 + " " + num2);  // Prints first two numbers
        for(i = 2; i < n; ++i){
            num3 = num1 + num2;
            System.out.print(" " + num3);
            num1 = num2;
            num2 = num3;
        }
        long endTime1 = System.nanoTime();      // End time calculation
        long totalTime1 = endTime1 - startTime1;  // Total time calculation for 1st set
        System.out.print(" | " + totalTime1 + "-ns");

        // Part of design of table
        System.out.println();
        System.out.println("------------------------------------------------------------------------------");
        System.out.print("Recursive      |  ");

        // Fibonacci sequence with recursion
        long startTime2 = 0;
        int n2 = 15;
        int numA = 0;
        int numB = 1;
        System.out.print(numA + " " + numB);  // printing 0 and 1 variables
        FibonacciRecursion.printFb(n2 - 2); // omitting last two numbers
        
        long duration = System.nanoTime() - startTime2;
        System.out.println(" | " + duration + "-ns");
    }
}
