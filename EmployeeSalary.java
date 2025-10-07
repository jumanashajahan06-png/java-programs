import java.util.Scanner;

public class EmployeeSalary {
    public static void main(String[] args) {
        // Input
        try (Scanner sc = new Scanner(System.in)) {
            // Input
            System.out.print("Enter monthly salary: ");
            double monthlySalary = sc.nextDouble();
            sc.nextLine(); // consume leftover newline
            
            System.out.print("Enter day of week (e.g., Monday): ");
            String dayOfWeek = sc.nextLine().toLowerCase();
            
            // Calculate base daily salary (assuming 30 days in a month)
            double dailySalary = monthlySalary / 30;
            
            switch (dayOfWeek) {
                case "monday", "wednesday", "friday" -> {
                }
                case "tuesday" -> dailySalary += 10;
                case "thursday" -> dailySalary += 5;
                
                case "saturday" -> dailySalary += 15;
                
                case "sunday" -> dailySalary = 0; // No salary on Sunday
                
                default -> {
                    System.out.println("❌ Invalid day entered!");
                    sc.close();
                    return; // Exit program
                }
            }
            // Regular salary, no bonus
            
            // Output
            System.out.println("✅ Daily salary on " + capitalize(dayOfWeek) + ": " + dailySalary);
        }
    }

    // Helper method to capitalize first letter of day
    public static String capitalize(String str) {
        if (str == null || str.isEmpty()) return str;
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }
}
