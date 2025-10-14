import java.util.Scanner;

public class SwapFirstLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int n = sc.nextInt();

        // If the number has only one digit
        if (n < 10) {
            System.out.println("Swapped number: " + n);
            sc.close();
            return;
        }

        int temp = n;
        int last = n % 10;

        // Find first digit
        while (temp >= 10) {
            temp = temp / 10;
        }
        int first = temp;

        // Find number of digits
        int digits = (int) Math.log10(n);

        // Find middle part
        int middle = (n % (int) Math.pow(10, digits)) / 10;

        // Swap first and last
        int swapped = last * (int) Math.pow(10, digits) + middle * 10 + first;

        System.out.println("Swapped number: " + swapped);

        sc.close();
    }
}


  
