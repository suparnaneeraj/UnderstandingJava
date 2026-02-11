import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExample{
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int number;

        try{
            System.out.print("Enter a number: ");
            number = scanner.nextInt();
            System.out.println("Entered : "+number);
            System.out.println("Going to divide 1000 by the above number ");
            int answer = 1000/number;
            System.out.println("The answer is "+answer);
        }
        catch(ArithmeticException e){
            System.out.println("You cannot divide by 0");
        }

        catch(InputMismatchException e){
            System.out.println("You have entered wrong input");
        }

        catch(Exception e){
            System.out.println("Something went wrong");
        }

        finally{
            scanner.close();
            System.out.println("This is always executed");
        }
    }
}