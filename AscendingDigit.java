import java.util.Scanner;

public class AscendingDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number:");
        int num = sc.nextInt();

        int prevDigit = 10;
        boolean ascending = true; 

        while (num > 0) {
            int currentDigit = num % 10; 
            num = num / 10;             

            if (currentDigit > prevDigit) { 
                ascending = false;
                break;
            }

            prevDigit = currentDigit; 
        }

        if (ascending) {
            System.out.println("Digits are in ascending order");
        } else {
            System.out.println("Digits are not in ascending order");
        }

        sc.close();
    }
}
