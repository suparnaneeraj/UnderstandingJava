package files;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
    
    public static void main(String[] args){

        String filePath = "/Users/suparnaneeraj/Desktop/file.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(filePath))){
            String line ;
            while((line = reader.readLine())!=null){
                System.out.println(line);
            }
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate file");
        }
        catch(IOException e){
            System.out.println("Could not read from fiel");
        }
    }
}
