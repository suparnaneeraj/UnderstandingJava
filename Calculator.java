import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1 , number2 , result=0;
        char operator;
        System.out.print("Enter the numbers : ");
        number1 = scanner.nextDouble();
        number2 = scanner.nextDouble();
        System.out.print("Enter the operation : ");
        operator = scanner.next().charAt(0);
        scanner.nextLine();
        switch (operator) {
            case '+' :
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
            case '*':
                result = number1 * number2;
            case '/':
                result = number1 / number2;
            case '%':
                result = number1 % number2;
            default:
                System.out.println("Wrong operation");
                break;
        }
        System.out.println("The result is " +result);
        scanner.close();
    }
}
