package com.learning.xml.challenge1;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {
    private List<User> users = new ArrayList<>();
    private User user;

    private boolean bfn = false;
    private boolean bln = false;

    @Override
    public void startElement(String uri, String localName, String qname,
        Attributes attributes) throws SAXException {
        
        if("user".equals(qname)) {
            user = new User();

            int id = Integer.valueOf(attributes.getValue("id"));
            user.setId(id);
        }

        switch(qname) {
            case "firstname":
                bfn = true;
                break;

            case "lastname":
                bln = true;
                break;
        }
    }

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        if(bfn) {
            user.setFirstname(new String(ch, start, length));
            bfn = false;
        }

        if(bln) {
            user.setLastname(new String(ch, start, length));
            bln = false;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qname) throws SAXException {
        if("user".equals(qname)) {
            users.add(user);
        }
    }

    public List<User> getUsers() {
        return users;
    }
}
