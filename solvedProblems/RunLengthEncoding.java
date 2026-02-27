package solvedProblems;

import java.util.Scanner;

public class RunLengthEncoding {
    
    public static void main(String[] args){
        String inputString, encodedString;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your string");
        inputString = scanner.nextLine();
        encodedString = stringLengthEncoding(inputString);
        System.out.println("The encoded string is "+encodedString);
        scanner.close();

    }

    static String stringLengthEncoding(String inputString){
        //String resultString = "";
        int count =1;
        StringBuilder resultString = new StringBuilder();
        // for(int i=0;i<inputString.length();i++){
        //     System.out.println("Inside first for with i "+i);
        //     for(int j=i+1;j<=inputString.length()-1;j++){
        //         System.out.println("second for");
        //         if(inputString.charAt(i)==inputString.charAt(j)){
        //             System.out.println("Inside if");
        //             count++;
        //             System.out.println(count);
        //         }
        //         else{
        //             System.out.println("Inside else");
        //             System.out.println(count + " " +j);
        //             resultString+= String.valueOf(inputString.charAt(i))+String.valueOf(count);
        //             System.out.println(resultString);
        //             count=1;
        //             i=j-1;
        //             break;
        //         }
        //         if(j==inputString.length()-1){
        //             i=j;
        //         }
                    
        //     }
        //     if(i==inputString.length()-1){
        //         resultString+= String.valueOf(inputString.charAt(i))+String.valueOf(count);
        //         break;
        //     }
        // }
        
        for(int i=1;i<inputString.length();i++){
            if(inputString.charAt(i)==inputString.charAt(i-1)){
                count ++;

            }
            else{
                resultString.append(inputString.charAt(i-1)).append(count);
                break;
            }
        }
        resultString.append(inputString.charAt(inputString.length()-1)).append(count);
        return resultString.toString();
    }

}
