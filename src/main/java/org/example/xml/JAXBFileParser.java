package org.example.xml;

import jakarta.xml.bind.JAXBContext;
import jakarta.xml.bind.JAXBException;
import jakarta.xml.bind.Unmarshaller;

import java.io.File;

public class JAXBFileParser {
    public static void parseXML(String xmlPath) {
        try {
            JAXBContext context = JAXBContext.newInstance(Library.class);
            Unmarshaller unmarshaller = context.createUnmarshaller();
            Library library = (Library) unmarshaller.unmarshal(new File(xmlPath));
            System.out.println(library);
        } catch (JAXBException e) {
            System.err.println("Error parsing XML: " + e.getMessage());
            e.printStackTrace();
        }
    }
}