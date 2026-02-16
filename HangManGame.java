import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HangManGame {
    
    public static void main(String[] args) {
        String filePath = "words.txt", line="",word;
        ArrayList<String> listOfWords = new ArrayList<>();
        ArrayList<Character>wordState = new ArrayList<>();
        char guess;
        int wrongGuessNumber=0;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            while ((line=reader.readLine())!=null) {
                //System.out.println(line);
                listOfWords.add(line.trim());
            }
         
        }
        catch(FileNotFoundException e){
            System.out.println("File not found");
        }
        catch(IOException e){
            System.out.println("Could not read from file");
        }
        word = listOfWords.get(random.nextInt(listOfWords.size()));
        for(int i=0;i<word.length();i++){
            wordState.add('_');
        }
        for(char c : wordState){
            System.out.print(c + " ");
        }
        System.out.println();
        System.out.println("***********************");
        System.out.println("Welcome to java Hangman");
        System.out.println("***********************");
        System.out.println();
        while(wrongGuessNumber <6){
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
                System.out.println("Sorry wrong guess !!!");
                System.out.println(getHangmanArt(wrongGuessNumber));
            }
          
            if(wrongGuessNumber>=6){
                    System.out.println("You lost ..Game over!! ");
                    System.out.println("The word was : "+word);
                    break;
            }            
            
        }
        scanner.close();
        
        
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
