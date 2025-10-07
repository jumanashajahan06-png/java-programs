import java.util.Scanner;

public class StarPattern {
    public static void main(String[] args) {
        // Input number of rows
        try (Scanner sc = new Scanner(System.in)) {
            // Input number of rows
            System.out.print("Enter number of rows (N): ");
            int N = sc.nextInt();
            
            // Outer loop → rows
            for (int i = 1; i <= N; i++) {
                // Inner loop → stars in each row
                for (int j = 1; j <= i; j++) {
                    System.out.print("*");
                }
                // Move to next line after each row
                System.out.println();
            }
        }
    }
}
