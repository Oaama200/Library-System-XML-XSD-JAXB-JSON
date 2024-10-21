package org.example.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
public class Patron {
    @XmlElement(name = "PatronID")
    private int patronId;

    @XmlElement(name = "FirstName")
    private String firstName;

    @XmlElement(name = "LastName")
    private String lastName;

    @XmlElement(name = "Email")
    private String email;

    @XmlElement(name = "Phone")
    private String phone;

    @XmlElement(name = "MembershipDate")
    private XMLGregorianCalendar membershipDate;

    @XmlElement(name = "MembershipType")
    private String membershipType;

    @Override
    public String toString() {
        return "Patron{" +
                "patronId=" + patronId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", membershipDate=" + membershipDate +
                ", membershipType='" + membershipType + '\'' +
                '}';
    }
}