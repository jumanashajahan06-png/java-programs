import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter base salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // to clear the newline

        System.out.print("Enter performance rating (Excellent / Good / Average / Poor): ");
        String rating = sc.nextLine();

        double adjustedSalary = salary;
        double bonus = 0;

       
        if (rating.equalsIgnoreCase("Excellent")) {
            adjustedSalary = salary + (salary * 0.20);
            bonus = 10000;
        } else if (rating.equalsIgnoreCase("Good")) {
            adjustedSalary = salary + (salary * 0.10);
            bonus = 5000;
        } else if (rating.equalsIgnoreCase("Average")) {
            adjustedSalary = salary + (salary * 0.05);
            bonus = 2000;
        } else if (rating.equalsIgnoreCase("Poor")) {
            adjustedSalary = salary;  // no increase
            bonus = 0;
        } else {
            System.out.println("Invalid rating! Please enter Excellent, Good, Average, or Poor.");
            sc.close();
            return;
        }

        // Step 3: Display the result
        System.out.println();
        System.out.println("Adjusted Salary: " + (int)adjustedSalary);
        System.out.println("Bonus: " + (int)bonus);

        sc.close();
    }
}
