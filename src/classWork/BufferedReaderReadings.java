package classWork;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderReadings {
    public static void main(String[] args) throws FileNotFoundException {
      String location = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork\\jack.txt";
      try(BufferedReader reader = new BufferedReader(new FileReader(String.valueOf(location)))) {
          System.out.println(reader.readLine());
      } catch (IOException e) {
          throw new RuntimeException(e);
      }
    }
}
