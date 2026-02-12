package files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {
    public static void main(String[] args) {
        
        String filePath = "/Users/suparnaneeraj/Desktop/file.txt", textContent = """
                Java is simple
                Java is robust
                Java is powerful
                """;
        
        try(FileWriter fileWriter = new FileWriter(filePath)){
            fileWriter.write(textContent);
            System.out.println("File written successfully");
        }
        catch(FileNotFoundException e){
            System.out.println("Could not locate the location");
        }
        catch(IOException e){
            System.out.println("Could not write to the file");
        }

    }
}
