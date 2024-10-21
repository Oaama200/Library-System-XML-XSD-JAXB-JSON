package org.example.jason;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class Event {
    @JsonProperty("eventId")
    private int eventId;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    @JsonProperty("eventDate")
    private Date eventDate;

    @JsonProperty("eventLocation")
    private String eventLocation;

    @Override
    public String toString() {
        return "Event{" +
                "eventId=" + eventId +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", eventDate=" + eventDate +
                ", eventLocation='" + eventLocation + '\'' +
                '}';
    }
}