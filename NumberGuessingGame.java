import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String [] args){
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int number , randomNumber,count=0;
        randomNumber=random.nextInt(1,11); // 11 is exclusive
        //System.out.println("Random number "+randomNumber);
        do{
            System.out.print("Enter your guess : ");
            number = scanner.nextInt();
            count++;

        }while(number!=randomNumber);
        System.out.println("You got your guess right at "+count+" th time");
        scanner.close();

    }
}
