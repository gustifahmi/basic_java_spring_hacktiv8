package com.learning.xml.dom;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

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
            document = builder.parse(new File("src/main/resources/employees.xml"));
        } catch(Exception e) {
            e.printStackTrace();
        }

        //Normalize XML Structure
        document.getDocumentElement().normalize();

        //Root node
        Element root = document.getDocumentElement();
        System.out.println("\n" + root.getNodeName());

        //Get all employees
        NodeList nList = document.getElementsByTagName("employee");
        System.out.println("====================");

        for(int i = 0; i < nList.getLength(); i++) {
            Node node = nList.item(i);
            System.out.println();

            if(node.getNodeType() == Node.ELEMENT_NODE) {
                Element eElement = (Element)node;
                System.out.println("Employee ID: " + eElement.getAttribute("id"));
                System.out.println("First Name: " + eElement.getElementsByTagName("firstname").item(0).getTextContent());
                System.out.println("Last Name: " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
                System.out.println("Location: " + eElement.getElementsByTagName("location").item(0).getTextContent());
            }
        }
    }
}