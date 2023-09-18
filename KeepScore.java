import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileWriter;

/**
 * RecordingKeeping
 */
public class KeepScore {

    public static void main(String[] args) {
        WriteToFile(args[0]);
    }
    public static void WriteToFile(String filename){
        try {
            FileWriter mywriter = new FileWriter(filename, true);
            String score = "35";
            mywriter.write(score);
            mywriter.close();
            System.out.println("Successfully written inside the file");
        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        
    }
}