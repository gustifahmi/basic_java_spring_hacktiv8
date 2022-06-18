package com.learning.xml.sax;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class MyRunner {
    private SAXParser createSaxParser() {
        SAXParser saxParser = null;

        try {
            SAXParserFactory factory = SAXParserFactory.newInstance();
            saxParser = factory.newSAXParser();

            return saxParser;
        } catch(ParserConfigurationException | SAXException ex) {
            Logger logger = Logger.getLogger(MyRunner.class.getName());
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return saxParser;
    }

    public List<User> parseUsers() {
        MyHandler handler = new MyHandler();
        String fileName = "src/main/java/com/learning/xml/sax/users.xml";
        File xmlDocument = Paths.get(fileName).toFile();

        try {
            SAXParser parser = createSaxParser();
            parser.parse(xmlDocument, handler);
        } catch(SAXException | IOException ex) {
            Logger logger = Logger.getLogger(MyRunner.class.getName());
            logger.log(Level.SEVERE, ex.getMessage(), ex);
        }

        return handler.getUsers();
    }
}
