import java.util.Scanner;
import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int noOfDice, total=0, roll;
        System.out.print("Enter the number of Dice ");
        noOfDice = scanner.nextInt();
        if(noOfDice>0){
            for(int i=0;i<noOfDice;i++){
                roll = random.nextInt(1,7);
                System.out.println("You rolled a "+roll);
                printDie(roll);
                total+=roll;
            }
            System.out.println("Total is " +total);
            scanner.close();
        }
        else{
            System.out.println("Sorry you entered invalid number. Please enter a number greater than 0");
        }
    }
    
    static void printDie(int roll){
        String dice1 = """
                 -------
                |       |
                |   0   |
                |       |
                 -------
                """;
        String dice2 = """
                 -------
                | 0     |
                |       |
                |      0|
                 -------
                """;
        String dice3 = """
                 -------
                | 0     |
                |   0   |
                |      0|
                 -------
                """;
        String dice4 = """
                 -------
                | 0    0|
                |       |
                | 0    0|
                 -------
                """;
        String dice5 = """
                 -------
                | 0    0|
                |   0   |
                | 0    0|
                 -------
                """;
        String dice6 = """
                 -------
                | 0    0|
                | 0    0|
                | 0    0|
                 -------
                """;

        switch (roll) {
            case 1: System.out.print(dice1);
                break;
            case 2: System.out.print(dice2);
                break;
            case 3: System.out.print(dice3);
                break;
            case 4: System.out.print(dice4);
                break;
            case 5: System.out.print(dice5);
                break;
            case 6: System.out.print(dice6);
                break;
            default: System.out.print("You rolled an invalid dice number");
                break;
        }
    }
}
