import java.util.Scanner;

public class ProductOfInt {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

      
            if (num == 0) {
                System.out.println("Product of digits: 0");
                return;
            }

     
            num = Math.abs(num);
            int product = 1;

            while (num > 0) {
                int digit = num % 10;     
                product *= digit;         
                num /= 10;                
            }

            System.out.println("Product of digits: " + product);
        }
    }
}
