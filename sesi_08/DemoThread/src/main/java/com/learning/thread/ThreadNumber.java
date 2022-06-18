package com.learning.thread;

import java.util.Random;

class NumberGenerator {
    private int low;
    private int high;

    public NumberGenerator(int low, int high) {
        this.low = low;
        this.high = high;
    }

    public int randomNumber() {
        Random r = new Random();
        int result = r.nextInt(high - low) + low;
        return result;
    }
}

public class ThreadNumber extends Thread {
    private final NumberGenerator ng;

    public ThreadNumber(NumberGenerator ng) {
        this.ng = ng;
    }

    @Override
    public void run() {
        callGenerator();
    }

    private void callGenerator() {
        synchronized(ng) {
            for(int i = 0; i < 3; i++) {
                System.out.println(getName() + " " + ng.randomNumber());
            }
        }
    }
}