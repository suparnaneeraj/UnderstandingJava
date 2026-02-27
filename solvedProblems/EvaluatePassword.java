package solvedProblems;

import java.util.Scanner;

//
public class EvaluatePassword {

    public static void main(String[] args){
        String password;
        boolean strong;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the password: ");
        password = scanner.nextLine();
        strong = checkPasswordStrength(password);
        if(strong){
            System.out.println("The password is strong");
        }
        else{
            System.out.println("The password is weak. Please enter a strong password");
        }
        scanner.close();
    }
    /* method to evaluate if the password is strong .A strong password must have:
	•	length ≥ 8
	•	at least 1 uppercase
	•	at least 1 lowercase
	•	at least 1 digit
	•	at least 1 special character */

    static boolean checkPasswordStrength(String password){
        //boolean strong = false;
        boolean hasUpper = false, hasLower= false, hasDigit =false, hasSpecial=false;
       //int upperCaseCount =0, lowerCaseCount =0, digitCount=0, specialSymbolCount=0;
        char[] passwordToList = password.toCharArray();
        // if(password.length()>=8){
        //     for (char c: passwordToList){
        //         if((int)c >= 65 && (int)c <= 90){
        //             upperCaseCount++;
        //         }
        //         if((int)c >= 97 && (int)c <= 122){
        //             lowerCaseCount++;
        //         }
        //         if(Character.isDigit(c)){
        //             digitCount++;
        //         }
        //         if(c=='*'||c=='@'||c=='#'||c=='&'||c=='%'||c=='$'){
        //             specialSymbolCount++;
        //         }
        //     }
        //     if(upperCaseCount>0 && lowerCaseCount>0 && digitCount >0 && specialSymbolCount>0){
        //         strong=true; 
        //     }
        // }

        if(passwordToList.length>=8){
            for (char c: passwordToList){
                if(Character.isUpperCase(c)){
                    hasUpper=true;
                }
                if(Character.isLowerCase(c)){
                    hasLower=true;
                }
                if(Character.isDigit(c)){
                    hasDigit=true;
                }
                else{
                    hasSpecial=true;
                }
            }
            if(hasDigit && hasUpper && hasLower && hasSpecial){
                return true;
            }
        }
        

        return false;
    }
    
}
