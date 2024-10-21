package org.example.xml;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

import javax.xml.datatype.XMLGregorianCalendar;

@XmlAccessorType(XmlAccessType.FIELD)
public class Event {
    @XmlElement(name = "EventID")
    private int eventId;

    @XmlElement(name = "Name")
    private String name;

    @XmlElement(name = "Description")
    private String description;

    @XmlElement(name = "EventDate")
    private XMLGregorianCalendar date;

    @XmlElement(name = "EventLocation")
    private String location;

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", date=" + date +
                ", location='" + location + '\'' +
                '}';
    }
}