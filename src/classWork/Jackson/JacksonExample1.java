package classWork.Jackson;

import classWork.Cat;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class JacksonExample1 {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Cat meow = new Cat("meow", 10);
        try {
            objectMapper.writeValue(System.out, meow);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}