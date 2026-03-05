package solvedProblems;

import java.util.Scanner;



public class RetryMechanismSimulator {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int maxRetries, retryCount=1;
        String status;
        System.out.print("Enter the maximum retries allowed :");
        maxRetries = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Starting the process");
        while(retryCount<=maxRetries){
            System.out.print("Pass or fail ? ");
            status = scanner.nextLine().toLowerCase();
            if(status.equals("fail")){
                System.out.println("Attempt "+retryCount+ " Failed");
            }
            else {
                System.out.println("Attempt " +retryCount+ " Success");
                break;
            }
            retryCount++;
        }
        
         scanner.close();
        throw new RuntimeException("Error occured");
         
    }
       
    


}