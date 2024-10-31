package classWork.TransactionTask;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private int id;
    private BigDecimal amount;
    private String reference;
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate dateCreated = LocalDate.now();
    List<Transaction> transactions = new ArrayList<>();
    public Transaction(){

    }

    public Transaction(int i, BigDecimal bigDecimal, LocalDate now) {
    }

    public static void readValues(String location) {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(LocalDate dateCreated) {
        this.dateCreated = dateCreated;
    }

    public void log(List<Transaction> transactions, String filename) {
    }
}
