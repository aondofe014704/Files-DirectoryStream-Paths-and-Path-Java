package classWork.TransactionTask;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class MainTransaction {
    public static void main(String[] args) {
        String fileLocation = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork\\TransactionTask\\transactions.json";
        Path path = Path.of(fileLocation);
        try{
            Files.createFile(path);
        }catch (IOException e){
            throw  new RuntimeException(e);
        }

    }

}
