import java.util.Scanner;

public class ArrayProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int fruitsLength;
        System.out.println("Enter the number of fruits you want to enter : ");
        fruitsLength=scanner.nextInt();
        scanner.nextLine();
        String[] fruits = new String[fruitsLength];
   
        for(int i=0;i<fruitsLength;i++){
            System.out.print("Enter the fruit name: ");
            fruits[i]=scanner.nextLine();
        }
        for(String fruit : fruits){
            System.out.println(fruit);
        }
        scanner.close();

    }
}
