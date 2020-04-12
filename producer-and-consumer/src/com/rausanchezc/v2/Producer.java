package com.rausanchezc.v2;

import java.util.List;
import java.util.Random;

public class Producer implements Runnable {
    private List<String> buffer;
    private String color;

    public Producer(List<String> buffer, String color) {
        this.buffer = buffer;
        this.color = color;
    }

    @Override
    public void run() {
        final Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};
        for (String num: nums){
            try {
                System.out.println(color + "Adding ... "+ num);
                synchronized (buffer) {
                    buffer.add(num);
                }
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println("Adding EOF and exiting...");
        synchronized (buffer) {
            buffer.add("EOF");
        }
    }
}
