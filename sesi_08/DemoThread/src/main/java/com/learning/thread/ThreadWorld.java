package com.learning.thread;

import java.util.logging.Logger;
import java.util.logging.Level;

public class ThreadWorld  extends Thread {
    @Override
    public void run() {
        System.out.println(getName() + ": World");
    
        try {
            Thread.sleep(250);
        } catch(InterruptedException ex) {
            Logger.getLogger(ThreadHello.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
