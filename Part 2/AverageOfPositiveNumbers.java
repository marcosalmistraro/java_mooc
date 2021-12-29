import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int countOfPositives = 0;
        
        while (true) {
            double number = Double.valueOf(scanner.nextLine());
            if (number > 0){
                countOfPositives++;
                sum = sum + number;
            } 
            if (number == 0) {
                if (countOfPositives==0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    double averageOfPositives = (sum/countOfPositives);
                    System.out.println(averageOfPositives);
                    break;
                }
            }
        }
        scanner.close();
    }
}