import java.util.Scanner;

public class SumFirstLastDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a positive number:");
        int n = sc.nextInt();

        int lastDigit = n % 10;
        int firstDigit = n;

        while (firstDigit >= 10) {
            firstDigit = firstDigit / 10;
        }

        int sum = firstDigit + lastDigit;
        System.out.println("The sum of first and last digit is: " + sum);

        sc.close();
    }
}
