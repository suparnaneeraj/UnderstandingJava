package solvedProblems;

import java.util.Scanner;

public class UsernameGenerator {
    public static void main(String[] args) {
        
        String firstName, lastName, userName;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you first name :");
        firstName = scanner.nextLine();
        System.out.print("Enter you last name :");
        lastName = scanner.nextLine();

        if(!firstName.isBlank() && !lastName.isBlank()){
            firstName.replaceAll(" \\s+", "").toLowerCase();
            lastName.replaceAll("\\s+", "").toLowerCase();
            userName = getUsername(firstName, lastName);
            System.out.println("The username is "+userName);
       
        }
        else{
            System.out.println("Please enter valid name");
        }
         scanner.close();
       
    }
    static String getUsername(String firstName, String lastName){
        StringBuilder userName = new StringBuilder();
        userName.append(firstName).append(lastName.charAt(0));

        return userName.toString();

    }
}
