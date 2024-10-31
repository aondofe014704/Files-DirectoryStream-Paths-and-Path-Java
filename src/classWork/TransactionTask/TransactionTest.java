//package classWork.TransactionTask;
//
//import classWork.TransactionTask.Transaction;
//
//import java.io.File;
//import java.io.FileOutputStream;
//import java.io.IOException;
//import java.math.BigDecimal;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.time.LocalDate;
//import java.time.LocalDateTime;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Main {
//    public static void main(String[] args) {
//        String location = "C:\\Users\\DELL\\Documents\\MyProject\\Project\\FilesPractice\\src\\classWork\\TransactionTask\\transactions.json";
//        Transaction transaction = new Transaction();
//        try {
////            transaction.(location);
////        }catch (IOException exception){
////            System.out.println(exception.getMessage());
////        }
//
//            String filename = "transaction.json";
//
//            List<Transaction> transactions = new ArrayList<>(
//                    Arrays.asList(
//                            new Transaction(1, new BigDecimal("2000"), LocalDate.now()),
//                            new Transaction(2, new BigDecimal("6000"), LocalDate.now()),
//                            new Transaction(6, new BigDecimal("8000"), LocalDate.now())
//                    )
//            );
//            transaction.log(transactions, filename);
//
//            Transaction.readValues(location);
//}