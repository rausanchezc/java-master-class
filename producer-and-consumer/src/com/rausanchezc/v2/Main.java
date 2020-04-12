package com.rausanchezc.v2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> buffer = new ArrayList<>();
        final Producer producer = new Producer(buffer, ThreadColor.ANSI_YELLOW);
        final Consumer consumer1 = new Consumer(buffer, ThreadColor.ANSI_PURPLE);
        final Consumer consumer2 = new Consumer(buffer, ThreadColor.ANSI_CYAN);

        new Thread(producer).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
    }
}
