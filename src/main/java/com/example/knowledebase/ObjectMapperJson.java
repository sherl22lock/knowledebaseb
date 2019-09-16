package com.example.knowledebase;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ObjectMapperJson {

    ObjectMapper mappper = new ObjectMapper();
    DocumentTypeFAQ documentTypeFAQ;

    {
        try {
            documentTypeFAQ = mappper.readValue(new File("C:/tagrget"), DocumentTypeFAQ.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
