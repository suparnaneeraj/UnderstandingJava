package miniProject;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.format.DateTimeParseException;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filePath = "/Users/suparnaneeraj/Downloads/In The Morning - The Grey Room _ Clark Sims.wav";
        String alarmTime;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        LocalTime localTime;
        System.out.print("Enter the time to set alaram (HH:mm:ss) :");
        alarmTime = scanner.nextLine();
        try{
            localTime = LocalTime.parse(alarmTime, formatter);
            System.out.println("Your alarm is set at "+localTime);
            AlarmClock alarmclock = new AlarmClock(localTime,filePath,scanner);
            Thread thread = new Thread(alarmclock);
            thread.start();
        }
        catch(DateTimeParseException e){
            System.out.println("Invalid format .. Please enter in HH:mm:ss format");
        }
       
   

    }
}
