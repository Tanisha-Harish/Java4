import java.util.Scanner;

public class level1_2 {

    // Method to calculate handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input
        System.out.print("Enter number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calling method
        int handshakes = calculateHandshakes(numberOfStudents);

        // Output
        System.out.println("Maximum number of possible handshakes: " + handshakes);

        sc.close();
    }
}