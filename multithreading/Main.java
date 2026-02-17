package multithreading;

public class Main {

    public static void main(String[] args) {
        
        Thread thread1 = new Thread(new MyRunnable("Ping"));
        Thread thread2 = new Thread(new MyRunnable("Pong"));
        System.out.println("Game start");
        thread1.start();
        thread2.start();
        try{
            thread1.join(); // main thread to wait for the thread to complete
            thread2.join();
        }
        catch(InterruptedException e){
            System.out.println("Thread was interrupted");
        }
        System.out.println("Game over");

    }
    
}
