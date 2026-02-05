import java.util.Scanner;
class CompoundInterest{
     
    public static void main(String [] args){
        double compoundInterest , principalAmount;
        float year , rate;
        int times;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the amount :");
        principalAmount =   scanner.nextDouble();
        System.out.print("Enter the duration in years :");
        year=scanner.nextFloat();
        System.out.print("Enter the no of times compounded :");
        times=scanner.nextInt();
        System.out.print("Enter the rate in % :");
        rate=scanner.nextFloat()/100;
        compoundInterest =principalAmount * Math.pow(1 + (rate  /   times),times*year);
        System.out.println("The compount interest is : "+ compoundInterest);
        scanner.close();
    }
    
}