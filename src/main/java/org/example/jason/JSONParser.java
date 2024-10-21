package org.example.jason;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JSONParser {
    public static void parseJSON(String jsonPath) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Library library = mapper.readValue(new File(jsonPath), Library.class);
        System.out.println(library);
    }
}