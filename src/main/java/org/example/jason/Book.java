package org.example.jason;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Book {
    @JsonProperty("bookId")
    private int bookId;
    @JsonProperty("title")
    private String title;

    @JsonProperty("isbn")
    private String isbn;

    @JsonProperty("publicationYear")
    private int publicationYear;

    @JsonProperty("editionNumber")
    private int editionNumber;
    // Getters and setters

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", isbn='" + isbn + '\'' +
                ", publicationYear=" + publicationYear +
                ", editionNumber=" + editionNumber +
                '}';
    }
}
