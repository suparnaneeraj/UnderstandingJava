package threading;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        MyRunnable runnable = new MyRunnable();
        Thread thread = new Thread(runnable);
        thread.setDaemon(true);
        thread.start(); 
        System.out.println("You have 5 second to enter your name ");
        System.out.print("Enter your name :");
        name = scanner.nextLine();
        System.out.println("Hello "+name);
        scanner.close();
    }
}
