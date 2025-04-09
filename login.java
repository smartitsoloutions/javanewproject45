import java.util.Scanner;

public class LoginSystem {

    public static void main(String[] args) {
        // Hardcoded username and password
        String correctUsername = "administratior";
        String correctPassword = "ASDasd123";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(correctUsername) && enteredPassword.equals(correctPassword)) {
            System.out.println("Login successful! Welcome " + enteredUsername + ".");
        } else {
            System.out.println("Invalid username or password.");
        }

        scanner.close();
    }
}

public class HelloWorld {

    // Main method: the entry point of the program
    public static void main(String[] args) {
        HelloWorld greeter = new HelloWorld();
        greeter.sayHello("World");
    }

    // Method to print a greeting message
    public void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }
}
