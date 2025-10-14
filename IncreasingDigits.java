import java.util.Scanner;

public class IncreasingDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();

        int prev = 10; // any digit is smaller than 10
        boolean increasing = true;

        while (num > 0) {
            int digit = num % 10; // get last digit
            num /= 10;            // remove last digit

            if (digit >= prev) {  // compare with previous digit
                increasing = false;
                break;
            }
            prev = digit;
        }

        if (increasing)
            System.out.println("Digits are in increasing order");
        else
            System.out.println("Digits are not in increasing order");

        sc.close();
    }
}

