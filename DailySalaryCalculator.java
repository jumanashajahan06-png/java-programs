import java.util.Scanner;

public class DailySalaryCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Monthly Salary:");
        int MonthlySalary = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("enter the day of the week:");
        String dayofweek = sc.nextLine();  // fixed: use nextLine(), not nextInt()

        int DailySalary = MonthlySalary / 30;

        switch (dayofweek.toLowerCase()) {   // case-insensitive
            case "monday" -> {
            }
            case "tuesday" -> DailySalary += 10;   // fixed: =+ → +=
            case "wednesday" -> {
            }
            case "thursday" -> DailySalary += 5;   // fixed
            case "friday" -> {
            }
            case "saturday" -> DailySalary += 15;  // fixed
            case "sunday" -> DailySalary = 0;      // off day
            default -> {
                System.out.println("invalid day of the week");
                return;
            }
        }

        System.out.println("Daily salary on " + dayofweek + ": " + DailySalary);
    }
}
