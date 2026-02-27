package solvedProblems;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class LogLevelCounter {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder logs = new StringBuilder();
        String line,stringLogs;
        System.out.println("Enter the log");
        while(true){
            line =scanner.nextLine();
            if(line.isEmpty()){
                break;
            }
            else{
                logs.append(line).append("\n");
            }
        }
        stringLogs=logs.toString();
        logLevelCounter(stringLogs);
        scanner.close();
       
    }
    static void logLevelCounter(String logs){
        List<String> logWords = Arrays.asList(logs.trim().split("[.\\s]+"));
        int countInfo =0, countWarn =0, countError=0;
        for(String word : logWords){
            if(word.equals("INFO")){
            countInfo++;
            }
            else if(word.equals("WARN")){
            countWarn++;
            }
            else if(word.equals("ERROR")){
            countError++;
            }
        }
      
        System.out.println("The INFO count : "+countInfo);
        System.out.println("The WARN count : "+countWarn);
        System.out.println("The ERROR count : "+countError);
    }


}
