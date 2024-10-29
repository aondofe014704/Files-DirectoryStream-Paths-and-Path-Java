package classWork;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class FileReadingFiles {
    public static void main(String[] args) throws FileNotFoundException {
        String location = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork";
        try(FileReader reader = new FileReader("jack.txt")) {
            int bytes = reader.read();
            System.out.println(bytes);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
