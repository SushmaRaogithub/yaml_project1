import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for their name
        System.out.print("Enter your name: ");

        // Read the user's input and store it in a variable
        String name = scanner.nextLine();

        // Print a personalized message
        System.out.println("Hello, " + name + "! Welcome to the Java program.");

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}
