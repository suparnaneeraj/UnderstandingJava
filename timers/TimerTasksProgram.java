package timers;

import java.util.Timer;
import java.util.TimerTask;

public class TimerTasksProgram {
    public static void main(String[] args) {
         Timer timer= new Timer();
    TimerTask task = new TimerTask() {
        
        int count = 3;
        @Override
        public void run(){
            count--;
            System.out.println("Welcome");
            if(count<=0){
                System.out.println("Task complete");
                timer.cancel();
            }

        }
    };
    timer.schedule(task,0,1000);
    
    }

   
}
