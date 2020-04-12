package com.rausanchezc.v1;

import java.util.Random;

public class Writer implements Runnable {
    private Message message;

    public Writer(Message message) {
        this.message = message;
    }

    @Override
    public void run() {
        String [] messages = {
            "Humpty Dumpty sat on a wall",
            "Humpty Dumpty had a great fall",
            "All the king's horses and all the king's men",
            "Couldn't put Humpty together again."
        };

        Random random = new Random();

        for (String msg : messages) {
            message.write(msg);
            try {
                Thread.sleep(random.nextInt(2000));
            } catch (InterruptedException e) {
                System.out.println("Error Writer: " + e.getMessage());
            }
        }
        message.write("Finished");
    }
}
