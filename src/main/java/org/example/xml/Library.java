package org.example.xml;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "Library")
@XmlAccessorType(XmlAccessType.FIELD)
public class Library {
    @XmlElement(name = "Author")
    private List<Author> authors;

    @XmlElement(name = "Book")
    private List<Book> books;

    @XmlElement(name = "Patron")
    private List<Patron> patrons;

    @XmlElement(name = "Loan")
    private List<Loan> loans;

    @XmlElement(name = "Event")
    private List<Event> events;
    @Override
    public String toString() {
        return "Library{" +
                "\nauthors=" + authors +
                ", \nbooks=" + books +
                ", \npatrons=" + patrons +
                ", \nloans=" + loans +
                ", \nevents=" + events +
                '}';
    }
}