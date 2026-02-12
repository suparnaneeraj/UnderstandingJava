package files;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class MusicPlayer {
    
    public static void main(String[] args) {
        String filePath = "/Users/suparnaneeraj/Downloads/In The Morning - The Grey Room _ Clark Sims.wav", choice = "";
        File file = new File(filePath);
        try(Scanner scanner = new Scanner(System.in);
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);){
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            while(!(choice.equals("Q"))){
                System.out.println("P - Play");
                System.out.println("S -  Stop");
                System.out.println("R -  Reset");
                System.out.println("Q - Quit");
                System.out.print("Enter your choice : ");
                choice = scanner.next().toUpperCase();
                switch (choice) {
                    case "P" -> clip.start();
                    case "S" -> clip.stop();
                    case "R" -> clip.setMicrosecondPosition(0);
                    case "Q" -> clip.close();
                    default -> System.out.println("Wrong choice");
                }
            }
            
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate the file");
        }
        catch(UnsupportedAudioFileException e){
            System.out.println("File format not supported");
        }
        catch(IOException e){
            System.out.println("Could not play the file");
        }
        catch(LineUnavailableException e){
            System.out.println("Unable to access the audio resource");
        }
        finally{
            System.out.println("Bye");
            
        }

    }
}
