import java.util.Scanner;

/**
 * AverageCalculator - calculates the average of four examination scores.
 * Name: IKEJE CHRISTIAN AKACHUKWU | Matric No: 25/16116
 * Course: COS 201 - Computer Programming I
 */
public class AverageCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sum = 0;

        for (int i = 1; i <= 4; i++) {
            System.out.print("Enter score " + i + ": ");
            sum += input.nextDouble();
        }

        double average = sum / 4;
        System.out.println("Total = " + sum);
        System.out.printf("Average = %.2f%n", average);

        input.close();
    }
}
