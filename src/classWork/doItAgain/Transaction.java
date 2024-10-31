package classWork.doItAgain;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.datatype.jsr310.ser.LocalDateSerializer;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Transaction {
    private int id;
    private String reference;
    private BigDecimal amount;
    @JsonSerialize(using = LocalDateSerializer.class)
    private LocalDate createdAt = LocalDate.now();

    public Transaction(int id, String reference, BigDecimal amount) {
        this.id = id;
        this.reference = reference;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public String getReference() {
        return reference;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
