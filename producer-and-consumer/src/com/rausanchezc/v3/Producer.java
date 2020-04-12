package com.rausanchezc.v3;

import java.util.List;
import java.util.Random;
import java.util.concurrent.locks.ReentrantLock;

public class Producer implements Runnable {
    private List<String> buffer;
    private String color;
    private ReentrantLock bufferLock;

    public Producer(List<String> buffer, String color, ReentrantLock bufferLock) {
        this.buffer = buffer;
        this.color = color;
        this.bufferLock = bufferLock;
    }

    @Override
    public void run() {
        final Random random = new Random();
        String[] nums = {"1", "2", "3", "4", "5"};
        for (String num: nums){
            try {
                System.out.println(color + "Adding ... "+ num);
                bufferLock.lock();
                try {
                    buffer.add(num);
                } finally {
                    bufferLock.unlock();
                }
                Thread.sleep(random.nextInt(1000));
            } catch (InterruptedException e) {
                System.out.println("Producer was interrupted");
            }
        }
        System.out.println("Adding EOF and exiting...");
        bufferLock.lock();
        try {
            buffer.add("EOF");
        } finally {
            bufferLock.unlock();
        }
    }
}
