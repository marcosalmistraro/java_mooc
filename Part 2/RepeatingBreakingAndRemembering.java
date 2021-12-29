import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Give numbers:");
        int sum = 0;
        int count = 0;
        double avg = 0;
        int numberEven = 0;
        int numberOdd = 0;

        while(true){
            int givenNumber = Integer.valueOf(scanner.nextLine());  
            if(givenNumber == -1) {
                break;
            } else if(givenNumber != -1) {
                sum+=givenNumber;
                count++;
                avg = 1.0*(sum/count);
                if (givenNumber%2 == 0) {
                    numberEven++;
                } else {
                    numberOdd++;
                }
                continue;
            }
        }
        
        System.out.println("Thx! Bye!");
        System.out.println("Sum:" + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average:" + avg);
        System.out.println("Even:" + numberEven);
        System.out.println("Odd:" + numberOdd);
        scanner.close();
    }
}