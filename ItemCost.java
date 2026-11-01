import java.util.Scanner;

/**
 * ItemCost - calculates the total cost of items from quantity and unit price.
 * (Example from the assignment: 6 items at N250 each = N1500)
 * Name: IKEJE CHRISTIAN AKACHUKWU | Matric No: 25/16116
 * Course: COS 201 - Computer Programming I
 */
public class ItemCost {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter quantity of items: ");
        int quantity = input.nextInt();

        System.out.print("Enter unit price (N): ");
        double unitPrice = input.nextDouble();

        double totalCost = quantity * unitPrice;
        System.out.printf("Total cost = N%.2f%n", totalCost);

        input.close();
    }
}
