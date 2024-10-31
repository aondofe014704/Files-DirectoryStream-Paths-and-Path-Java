package classWork.Jackson;

import classWork.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;



import java.io.FileOutputStream;
import java.io.IOException;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

public class MapperIndentOutputSeserialize {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork\\Jackson\\cat.json";
        Cat cat = new Cat("Tom", 20);
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(INDENT_OUTPUT);

        try(var fileOutputStream = new FileOutputStream(fileName)){
            objectMapper.writeValue(fileOutputStream, cat);
        }catch (IOException exception){
            System.out.println("Error writting json to the file: " + exception);
        }
    }
}
