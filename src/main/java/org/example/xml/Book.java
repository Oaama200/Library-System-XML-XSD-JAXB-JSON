package org.example.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Book {
    @XmlElement(name = "BookID")
    private int bookId;

    @XmlElement(name = "Title")
    private String title;

    @XmlElement(name = "ISBN")
    private String isbn;

    @XmlElement(name = "publicationYear")
    private int publicationYear;

    @XmlElement(name = "EditionNumber")
    private int editionNumber;

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
