import java.util.Scanner;

public class Level1_3 {

    // Method to calculate rounds
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c; // triangle perimeter
        double totalDistance = 5000;  // 5 km = 5000 meters
        return totalDistance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for triangle sides
        System.out.print("Enter side 1 (in meters): ");
        double side1 = sc.nextDouble();

        System.out.print("Enter side 2 (in meters): ");
        double side2 = sc.nextDouble();

        System.out.print("Enter side 3 (in meters): ");
        double side3 = sc.nextDouble();

        // Calling method
        double rounds = calculateRounds(side1, side2, side3);

        // Output
        System.out.println("Number of rounds required to complete 5 km: " + rounds);

        sc.close();
    }
}