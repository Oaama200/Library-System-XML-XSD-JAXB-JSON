package org.example;

import org.example.jason.JSONParser;
import org.example.xml.StAXFileParser;

import org.example.xml.JAXBFileParser;
import org.example.xml.XMLValidator;

import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        validateXML();
        parseXMLUsingStAX();
        parseXMLUsingJAXB();
        parseJSONUsingJackson();
    }

    private static void validateXML() {
        boolean isValid = XMLValidator.validateXMLSchema("src/main/resources/library.xsd", "src/main/resources/library.xml");
        System.out.println("XML is valid against XSD: " + isValid);
    }
    private static void parseXMLUsingStAX() {
        try {
            StAXFileParser.parseXML("src/main/resources/library.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void parseXMLUsingJAXB() {
        try {
            JAXBFileParser.parseXML("src/main/resources/library.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void parseJSONUsingJackson() {
        try {
            JSONParser.parseJSON("src/main/resources/library.json");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
