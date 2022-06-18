package com.learning.xml.dom;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class ParseKnownXMLStructure {
    public static void main(String[] args) {
        //Get Document Builder
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch(Exception e) {
            e.printStackTrace();
        }

        //Build document
        Document document = null;
        try {
            document = builder.parse(new File("src/main/java/com/learning/xml/dom/employees.xml"));
        } catch(Exception e) {
            e.printStackTrace();
        }

        //Normalize XML Structure
        document.getDocumentElement().normalize();

        //Validasi struktur dokumen
        Schema schema = null;
        String language = XMLConstants.W3C_XML_SCHEMA_NS_URI;
        SchemaFactory schemaFactory = SchemaFactory.newInstance(language);
        try {
            schema = schemaFactory.newSchema(new File("src/main/java/com/learning/xml/dom/employees.xml"));
        } catch(Exception e) {
            e.printStackTrace();
        }

        Validator validator = schema.newValidator();
        try {
            validator.validate(new DOMSource(document));
        } catch(Exception e) {
            e.printStackTrace();
        }

        //Root node
        Element root = document.getDocumentElement();
        System.out.println(root.getNodeName());

        //Get all employees
        NodeList nList = document.getElementsByTagName("employees");
        System.out.println("====================");

        for(int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            System.out.println();

            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element)node;
                System.out.println("Employee ID: " + eElement.getAttribute("id"));
                System.out.println("First Name: " + eElement.getAttribute("firstName"));
                System.out.println("First Name: " + eElement.getAttribute("lastName"));
                System.out.println("First Name: " + eElement.getAttribute("location"));
            }
        }
    }
}