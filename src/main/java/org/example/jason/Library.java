package org.example.jason;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Library {
    @JsonProperty("authors")
    private List<Author> authors;

    @JsonProperty("books")
    private List<Book> books;

    @JsonProperty("patrons")
    private List<Patron> patrons;

    @JsonProperty("loans")
    private List<Loan> loans;

    @JsonProperty("events")
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