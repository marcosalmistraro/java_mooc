import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter username: ");
        String nameInput = scanner.nextLine();
        System.out.println("Enter password: ");
        String passwordInput = scanner.nextLine();
        
        if (nameInput.equals("alex") & passwordInput.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
            System.exit(0);
        }
        if (nameInput.equals("emma") & passwordInput.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username or password!");
        }
        scanner.close();
    }
}
