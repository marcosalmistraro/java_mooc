import java.util.Scanner;

public class DoubleInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number:");
        double somenumber = Double.valueOf(scanner.nextLine());
        System.out.println("You gave the number " + somenumber);

        scanner.close();
    }
}