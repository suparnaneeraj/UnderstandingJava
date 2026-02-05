import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
    public static void main(String[] args){
        String[] choices = {"rock", "paper", "scissors"};
        String userChoice, computerChoice,  playAgain="Y";
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while(playAgain.equals("Y")){
            System.out.print("Enter your input : ");
            userChoice = scanner.nextLine().toLowerCase();
            if(userChoice.equals("rock") || userChoice.equals("paper") || userChoice.equals("scissors")){
            System.out.println("You have entered : " +userChoice);
            computerChoice = choices[random.nextInt(3)];
            System.out.println("Computer's choice : " +computerChoice);
            if((userChoice.equals("rock") && computerChoice.equals("scissors")) || (userChoice.equals("scissors") && computerChoice.equals("paper")) || (userChoice.equals("paper") && computerChoice.equals("rock"))){
                System.out.println("You won");
            }
            else if (userChoice.equals(computerChoice)){
                System.out.println("It's a tie");
            }
            else{
                System.out.println("You lost");
            }
            }
            else{
                System.out.println("You have entered a wrong choice.");
            }
            System.out.print("Do you want to continue playing ? Please enter Y or N : ");
            playAgain = scanner.nextLine();
        }
        scanner.close();
    }
}
