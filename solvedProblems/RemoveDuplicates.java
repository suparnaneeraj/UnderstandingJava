package solvedProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {

    public static void main(String[] args){
        String sentence;
        String sentenceWithoutDuplicates ;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentence with duplicates");
        sentence = scanner.nextLine();
        sentenceWithoutDuplicates=removeDuplicatesFromASentence(sentence);
        System.out.println(sentenceWithoutDuplicates);
        scanner.close();
    }
    static String removeDuplicatesFromASentence(String sentence){

        ArrayList<String> wordsInSentence = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        for(int i=0;i<wordsInSentence.size();i++){
            System.out.println("The word at i" +wordsInSentence.get(i));
            for(int j=i+1;j<wordsInSentence.size();j++){
                 System.out.println("The word at j" +wordsInSentence.get(j));
                if(wordsInSentence.get(i).equals(wordsInSentence.get(j))){
                    System.out.println("Comparing"+wordsInSentence.get(i) + " "+wordsInSentence.get(j));
                    System.out.println("Removing "+wordsInSentence.get(j));
                    wordsInSentence.remove(j);
                    j--;
                }
            }
        }
        String result = String.join(" ", wordsInSentence);
        return result;
    }
    
}
