package org.example.xml;

import jakarta.xml.bind.annotation.*;

import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
public class Author {
    @XmlElement(name = "AuthorID")
    private int authorId;

    @XmlElement(name = "FirstName")
    private String firstName;

    @XmlElement(name = "LastName")
    private String lastName;

    @XmlElement(name = "Bio")
    private String bio;
    @XmlElement(name = "BirthDate")
    private XMLGregorianCalendar birthDate;

    @Override
    public String toString() {
        return "Author{" + "authorId=" + authorId + ", firstName='" + firstName + '\'' + ", lastName='" + lastName + '\'' + ", bio='" + bio + '\'' + ", birthDate=" + birthDate + '}';
    }
}