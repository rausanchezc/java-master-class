package com.rausanchezc.v3;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        ReentrantLock bufferLock = new ReentrantLock();
        final Producer producer = new Producer(buffer, ThreadColor.ANSI_YELLOW, bufferLock);
        final Consumer consumer1 = new Consumer(buffer, ThreadColor.ANSI_PURPLE, bufferLock);
        final Consumer consumer2 = new Consumer(buffer, ThreadColor.ANSI_CYAN, bufferLock);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
