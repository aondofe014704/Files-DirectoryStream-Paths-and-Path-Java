package classWork.Jackson;

import classWork.Cat;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JackSonExample {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();
        Cat meow = new Cat("meow", 10);
        try{
            String json = objectMapper.writeValueAsString(meow);
            System.out.println(json);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
