import java.util.Scanner;

public class SumOfFactorials {

    // Method to calculate factorial of a number
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;  // multiplying step by step
        }
        return fact;
    }

    // Method to calculate sum of factorials from M to N
    public static int sumOfFactorials(int M, int N) {
        if (M > N) {
            return 0; // If M is greater than N, return 0
        }

        int sum = 0;
        for (int i = M; i <= N; i++) {
            sum = sum + factorial(i);  // add each factorial
        }
        return sum;
    }

    public static void main(String[] args) {
        // Input values
        try (Scanner sc = new Scanner(System.in)) {
            // Input values
            System.out.print("Enter M: ");
            int M = sc.nextInt();
            
            System.out.print("Enter N: ");
            int N = sc.nextInt();
            
            // Calculate and print result
            int result = sumOfFactorials(M, N);
            
            // Display output
            System.out.println("The sum of factorials is: " + result);
        }
    }
}
