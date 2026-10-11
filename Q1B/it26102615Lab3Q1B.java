import java.util.Scanner;

public class IT26102615Lab3Q1B {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double price = input.nextDouble();

        System.out.print("Enter the number of kilograms: ");
        double kilograms = input.nextDouble();

        double total = price * kilograms;
        double discount = total * 0.10;
        double amount = total - discount;

        System.out.println("Total bill: Rs. " + total);
        System.out.println("Discount (10%): Rs. " + discount);
        System.out.println("Amount to pay: Rs. " + amount);

        input.close();
    }
}