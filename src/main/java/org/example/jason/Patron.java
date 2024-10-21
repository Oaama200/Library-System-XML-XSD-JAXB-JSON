package org.example.jason;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.sql.Date;

public class Patron {
    @JsonProperty("patronId")
    private int patronId;

    @JsonProperty("firstName")
    private String firstName;

    @JsonProperty("lastName")
    private String lastName;

    @JsonProperty("email")
    private String email;

    @JsonProperty("phone")
    private String phone;

    @JsonProperty("membershipDate")
    private Date membershipDate;

    @JsonProperty("membershipType")
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