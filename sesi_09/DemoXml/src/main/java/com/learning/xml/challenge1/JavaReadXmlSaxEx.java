package com.learning.xml.challenge1;

import java.util.List;

public class JavaReadXmlSaxEx {
    public static void main(String[] args) {
        MyRunner runner = new MyRunner();
        List<User> lines = runner.parseUsers();

        System.out.print("[");
        for(int i = 0; i < lines.size(); i++) {
            System.out.print(lines.get(i));
            if(i != lines.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]\n");
    }
}