package classWork.doItAgain;

import com.fasterxml.jackson.databind.ObjectMapper;


import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT;

public class ListOfTransactions {
    public static void main(String[] args) {
        Transaction transaction = new Transaction(1, "test", BigDecimal.valueOf(12000.00));
        Transaction transaction1 = new Transaction(1, "test", BigDecimal.valueOf(19000.00));
        Transaction transaction2 = new Transaction(1, "test", BigDecimal.valueOf(17000.00));
        List<Transaction> transactions = Arrays.asList(transaction, transaction1, transaction2);
        log(transactions);
    }
    public static void log(List<Transaction> transactions){
        String fileLocation = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork\\doItAgain\\transactionLog.json";
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(INDENT_OUTPUT);
        try(FileOutputStream fileOutputStream = new FileOutputStream(fileLocation)){
            objectMapper.writeValue(fileOutputStream, transactions);
        }catch (IOException exception){
            System.out.println(exception.getMessage());
        }

    }
}
