package timers;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class CountDown {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);
        int countDownStart;
        System.out.print("Enter the number from which countdown should start : ");
        countDownStart = scanner.nextInt();
        TimerTask task = new TimerTask() {

            int count = countDownStart;
            @Override
            public void run(){
                System.out.println(count);
                count--;
                if(count<0){
                    System.out.println("Happy New Year");
                    timer.cancel();
                }
            }

        };
        timer.schedule(task, 0,1000);
        scanner.close();
    }
    
}
