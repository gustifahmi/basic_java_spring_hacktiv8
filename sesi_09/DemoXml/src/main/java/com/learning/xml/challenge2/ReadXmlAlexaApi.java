package com.learning.xml.challenge2;

import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

public class ReadXmlAlexaApi {
    private static final String ALEXA_API = "https://data.alexa.com/data?cli=10&url=https://bcafinance.co.id/";
    private final DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
    
    public static void main(String[] args) {
        ReadXmlAlexaApi obj = new ReadXmlAlexaApi();

        int alexaRanking = obj.getAlexaRanking("bcafinance.co.id");

        System.out.println("====================");
        System.out.println("Ranking: " + alexaRanking);        
        System.out.println("====================");
    }

    public int getAlexaRanking(String domain) {
        int result = 0;
        String url = ALEXA_API + domain;
        try {
            URLConnection conn = new URL(url).openConnection();
            try(InputStream is = conn.getInputStream()) {
                builderFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
                DocumentBuilder builder = builderFactory.newDocumentBuilder();
                Document document = builder.parse(is);
                Element element = document.getDocumentElement();
                NodeList nodeList = element.getElementsByTagName("POPULARITY");
                if(nodeList.getLength() > 0) {
                    Element elementAttribute = (Element)nodeList.item(0);
                    String ranking = elementAttribute.getAttribute("TEXT");
                    if(!ranking.equals("")) {
                        result = Integer.parseInt(ranking);
                    }
                }
            }
        } catch(Exception e) {
            e.printStackTrace();
        }

        return result;
    }
}