import java.util.Scanner;

public class IT26102615Lab3Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter monthly salary: ");
        double salary = input.nextDouble();

        System.out.print("Enter number of OT hours: ");
        double otHours = input.nextDouble();

        System.out.print("Enter OT hourly rate: ");
        double otRate = input.nextDouble();

        double otAmount = otHours * otRate;
        double totalSalary = salary + otAmount;

        System.out.println("OT Amount: Rs. " + otAmount);
        System.out.println("Total Salary: Rs. " + totalSalary);

        input.close();
    }
}