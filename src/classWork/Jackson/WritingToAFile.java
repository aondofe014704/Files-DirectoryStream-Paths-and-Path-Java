package classWork.Jackson;

import classWork.Cat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class WritingToAFile {
    public static void main(String[] args) {
        Cat meow = new Cat("meow", 10);
        ObjectMapper objectMapper = new ObjectMapper();
        String nameOfFile = "jack.txt";
        try {
            objectMapper.writeValue(new File(nameOfFile), meow);
        } catch (JsonProcessingException e) {
            System.err.println("Failed to write to file: " +  nameOfFile);
            throw new RuntimeException(e);
        } catch (IOException e) {
            System.err.println("Failed to create file: " +  nameOfFile);
            throw new RuntimeException(e);
     }
    }
}
