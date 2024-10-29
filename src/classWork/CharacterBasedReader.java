package classWork;

import java.io.*;
import java.nio.file.Path;

public class CharacterBasedReader {
    public static void main(String[] args) {
        String location = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork";
        Path filePath = Path.of(location, "jack.txt");
//        String fileName = location.concat("word.txt");
        String greet = "Hello James";
        try(FileWriter writer = new FileWriter("jack.txt")){
            writer.write(greet);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
