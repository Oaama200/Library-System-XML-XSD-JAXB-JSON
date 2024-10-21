package org.example.xml;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamConstants;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class StAXFileParser {
    public static void parseXML(String xmlPath) {
        XMLInputFactory factory = XMLInputFactory.newInstance();
        try {
            InputStream inputStream = new FileInputStream(xmlPath);
            XMLStreamReader reader = factory.createXMLStreamReader(inputStream);

            while (reader.hasNext()) {
                int event = reader.next();
                switch (event) {
                    case XMLStreamConstants.START_ELEMENT:
                        System.out.println("Start Element: " + reader.getLocalName());
                        for (int i = 0; i < reader.getAttributeCount(); i++) {
                            System.out.println("Attribute: " + reader.getAttributeName(i) + " = " + reader.getAttributeValue(i));
                        }
                        break;
                    case XMLStreamConstants.CHARACTERS:
                        if (!reader.isWhiteSpace()) {
                            System.out.println("Text: " + reader.getText());
                        }
                        break;
                    case XMLStreamConstants.END_ELEMENT:
                        System.out.println("End Element: " + reader.getLocalName());
                        break;
                }
            }
            reader.close();
        } catch (FileNotFoundException | XMLStreamException e) {
            e.printStackTrace();
        }
    }
}
