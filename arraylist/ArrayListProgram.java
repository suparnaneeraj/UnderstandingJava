package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListProgram{

    public static void main(String[] args) {
        
        ArrayList<String> foods = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int noOfFood;
        String food;
        System.out.print("Enter the number of foods you would like to enter :");
        noOfFood = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Please enter the foods . Make sure to press enter after every food");
        for(int i=0;i<noOfFood;i++){
            food = scanner.nextLine();
            
            foods.add(food);
            
        }
        System.out.println("The food list :" +foods);

        foods.set(3,"rice");
        System.out.println("Going to remove : "+foods.get(1));
        foods.remove(1);
       
        System.out.println("Updated list :");
        System.out.println(foods);


        scanner.close();

    }

}