package org.example.jason;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class Loan {
    @JsonProperty("loanId")
    private int loanId;

    @JsonProperty("bookId")
    private int bookId;

    @JsonProperty("patronId")
    private int patronId;

    @JsonProperty("loanDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date loanDate;

    @JsonProperty("returnDate")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    private Date returnDate;

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", bookId=" + bookId +
                ", patronId=" + patronId +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                '}';
    }
}