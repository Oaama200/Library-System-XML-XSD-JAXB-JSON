package org.example.xml;

import javax.xml.XMLConstants;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.SchemaFactory;
import java.io.File;

public class XMLValidator {
    public static boolean validateXMLSchema(String xsdPath, String xmlPath) {
        try {
            SchemaFactory factory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
            factory.newSchema(new File(xsdPath)).newValidator().validate(new StreamSource(new File("src/main/resources/library.xml")));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
}