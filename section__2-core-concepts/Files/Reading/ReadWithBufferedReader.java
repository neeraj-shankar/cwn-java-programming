/*
 * 
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWithBufferedReader {
    
    public void readText(){

        // Path filePath = Paths.get("Files", "Reading", "myFile.txt");
        String filePath = "Files" + File.separator + "Reading" + File.separator + "myFile.txt";

        try(BufferedReader br = new BufferedReader(new FileReader(filePath))){
            String line;
            while((line = br.readLine())!= null){
                System.out.println(line);
            }
        } catch(IOException e){
            e.printStackTrace();
            System.out.println("File not found");
        }
    }
    public static void main(String[] args) {
        ReadWithBufferedReader rbr = new ReadWithBufferedReader();
        rbr.readText();
    }
}
