import java.util.ArrayList;
import java.util.Scanner;

public class HangManGame {
    
    public static void main(String[] args) {
        String word = "house";
        char guess;
        int wrongGuessNumber=0;
        Scanner scanner = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        for(int i=0;i<word.length();i++){
            wordState.add('_');
        }
        //System.out.println(wordState);
        System.out.println("***********************");
        System.out.println("Welcome to java Hangman");
        System.out.println("***********************");
        System.out.println();
        while(wrongGuessNumber <=6){
            System.out.print("Enter your guess :");
            guess = scanner.next().toLowerCase().charAt(0);
            if(word.indexOf(guess)>=0){
                System.out.println("Congrats your guess is right !!!");
                for(int j=0;j< wordState.size();j++){
                    if(word.charAt(j)==guess){
                        wordState.set(j, guess);
                    }
                    
                }
                //System.out.println(wordState);
                if(!(wordState.contains('_'))){
                    System.out.println("You won");
                    System.out.println("The word is "+word);
                    break;
                }
            }
            else{
                wrongGuessNumber++;
                if(wrongGuessNumber<=6){
                    System.out.println("Sorry wrong guess !!!");
                    System.out.println(getHangmanArt(wrongGuessNumber));
                }
                else{
                    System.out.println("You lost ..Game over!! ");
                    break;
                }               
            } 
        }
    }

    static String getHangmanArt(int wrongGuessNumber){
        return switch(wrongGuessNumber){
            case 0 -> """
                    
                      """;
            case 1 -> """
                       o

                      """;
            case 2 -> """
                        o
                       /
                      """;
            case 3 -> """
                         o
                       / |
                      """;
            case 4 -> """
                         o
                       / | \\
                      """;
            case 5 -> """
                         o
                       / | \\
                        /
                      """;
            case 6 -> """
                         o
                       / | \\
                        /  \\
                      """;
            default -> "";
        };

    }

}
