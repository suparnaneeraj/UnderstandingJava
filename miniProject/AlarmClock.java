package miniProject;


import java.io.File;
import java.io.IOException;
import java.time.LocalTime;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.sound.sampled.LineUnavailableException;
import java.util.Scanner;


public class AlarmClock implements Runnable {
    
    private final LocalTime localTime;
    private final String filePath;
    private final Scanner scanner;

    AlarmClock(LocalTime localTime,String filePath, Scanner scanner){
        this.localTime = localTime;
        this.filePath = filePath;
        this.scanner = scanner;
    }
    @Override
    public void run(){

        while(LocalTime.now().isBefore(localTime)){
            try{
                Thread.sleep(1000);
            }
            catch(InterruptedException e){
                System.out.println("Thread was interrupted");
            }
            LocalTime now = LocalTime.now();
            System.out.printf("\r%02d:%02d:%02d",now.getHour(),now.getMinute(),now.getSecond());

        }
        System.out.println("Alarm Rings");
        playSound(filePath);

    }

    public void playSound(String filePath){
        try{
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(new File(filePath));
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();
            System.out.print("Press any key to stop the alarm :");
            scanner.nextLine();
            clip.stop();
            scanner.close();

        }
        catch(UnsupportedAudioFileException e){
            System.out.println("Audio file not supported");
        }
        catch(IOException e){
            System.out.println("Could not find file");
        }
        catch(LineUnavailableException e){
            System.out.println("Could not open the file");
        }


        

    }
}
