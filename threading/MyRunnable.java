package threading;

public class MyRunnable implements Runnable {
    
    @Override
    public void run(){
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            System.out.println("Thread has been interrupted");
        }
        System.out.println("Time's up");
        System.exit(0);
    }

}
