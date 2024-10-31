package classWork.Jackson;

import classWork.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class MapperIndentOutputDeserialize {


    public static void main(String[] args) {
        String fileName = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork\\Jackson\\cat.json";
        ObjectMapper objectMapper = new ObjectMapper();
        try(FileInputStream fileInputStream = new FileInputStream(fileName)){
            Cat cat = objectMapper.readValue(fileInputStream, Cat.class);
            System.out.println("name:" + cat.getName() +"\n"  + "age:" + cat.getAge());
        } catch (IOException exception) {
            System.out.println(exception.getMessage());

        }
    }
    //write a code that will connect your computer to another one...
}
