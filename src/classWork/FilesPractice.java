package classWork;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FilesPractice {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork";
        Path filePath = Path.of(fileLocation, "jack.txt");

        try{
            Files.createFile(filePath);
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
        try {
            System.out.println(Files.size(filePath));
        } catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
