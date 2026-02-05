import java.util.Random;
import java.util.Scanner;

public class JavaSlotMachine{
    public static void main(String[] args){
        int bet, balance=100, payout;
        Scanner scanner = new Scanner(System.in);
        String[] rows;
        String choice="yes";
        System.out.println("  Welcome to Java slot machine  ");
        System.out.println(" Symbols: 🍎 🍒 🍐 🍋 🍓 ");
        while(balance>0){
            System.out.print("Place your bet : ");
            bet = scanner.nextInt();
            scanner.nextLine();
            if(bet > 0){
                balance-=bet;
                if(balance>=0){          
                    System.out.println("Your current balance is "+balance);
                    System.out.println("Starting the spin : ");
                    rows = rowSpin();
                    printRow(rows);
                    payout = calculatePayout(rows, bet);
                    if(payout>0){
                        System.out.println("Congrats !! You have won "+payout+"$");
                        balance +=payout;
                    }
                     else{
                        System.out.println("You lost");
                    }
                }
                else{
                    System.out.println("You have insufficient balance to play. Please recharge..");
                }
                   
            }
            else {
                System.out.println("Please enter a valid bet amount");
            }
            System.out.print("Do you want to continue playing ? Enter yes or no :");
            choice = scanner.nextLine();
            if(!choice.equalsIgnoreCase("yes")){
                break;
            }
        }
       
        scanner.close();

    }

    static String[] rowSpin(){
        String[] symbols = {"🍎", "🍒", "🍐", "🍋", "🍓"},row = new String[3];
        Random random = new Random();
        for(int i=0;i<3;i++){
            row[i] = symbols[random.nextInt(symbols.length)];
        }
        return row;
    }

    static void printRow(String[] rows){
        System.out.println("***********");
        System.out.println(" " + String.join("|", rows));
         System.out.println("***********");
    }

    static int calculatePayout(String[] rows, int bet){
        if(rows[0].equals(rows[1]) && rows[1].equals(rows[2])){
            return switch(rows[0]){
                case "🍎" -> bet * 3;
                case "🍒" -> bet * 4;
                case "🍐" -> bet * 5;
                case "🍋" -> bet * 10;
                case "🍓" -> bet * 20;
                default -> 0;
            };
        }
        else if(rows[0].equals(rows[1])){
            return switch(rows[0]){
                case "🍎" -> bet * 2;
                case "🍒" -> bet * 3;
                case "🍐" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🍓" -> bet * 10;
                default -> 0;
            };
        }
        else if(rows[1].equals(rows[2])){
            return switch(rows[1]){
                case "🍎" -> bet * 2;
                case "🍒" -> bet * 3;
                case "🍐" -> bet * 4;
                case "🍋" -> bet * 5;
                case "🍓" -> bet * 10;
                default -> 0;
            };
        
        }
        else{
            return 0;
        }
    }
}