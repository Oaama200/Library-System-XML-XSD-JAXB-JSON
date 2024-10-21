package org.example.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
public class Loan {
    @XmlElement(name = "LoanID")
    private int loanId;

    @XmlElement(name = "BookID")
    private int bookCopyId;

    @XmlElement(name = "PatronID")
    private int patronId;

    @XmlElement(name = "LoanDate")
    private XMLGregorianCalendar loanDate;

    @XmlElement(name = "ReturnDate")
    private XMLGregorianCalendar returnDate;

    @Override
    public String toString() {
        return "Loan{" +
                "loanId=" + loanId +
                ", bookCopyId=" + bookCopyId +
                ", patronId=" + patronId +
                ", loanDate=" + loanDate +
                ", returnDate=" + returnDate +
                '}';
    }
}