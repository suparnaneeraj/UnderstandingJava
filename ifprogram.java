import java.util.Scanner;

public class ifprogram {
    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age=scanner.nextInt();
        if(age >= 18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a child");
        }
        scanner.close();
    }
}
