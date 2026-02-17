package enums;

import java.util.Scanner;

public class EnumsDemo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String userDay;
        System.out.print("Enter any day of the week :");
        userDay = scanner.nextLine().toUpperCase();
        try{
             Day day = Day.valueOf(userDay);
        switch (day) {
            case MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY: System.out.println("Its a weekday"); break;
            case SATURDAY, SUNDAY : System.out.println("Its weekend"); break;
            default:System.out.println("Enter a valid day");
                break;
        }
        scanner.close();
        }

        catch(IllegalArgumentException e){
            System.out.println("Please enter a valid day");
        }
       
       

    }
}
