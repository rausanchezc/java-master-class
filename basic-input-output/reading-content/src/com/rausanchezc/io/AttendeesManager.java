package com.rausanchezc.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AttendeesManager {
    static private List<Person> attendees = new ArrayList<>();

    static {
        try {
            loadFromFile();
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static void loadFromFile() throws IOException {
        try(Scanner scanner = new Scanner(new BufferedReader(new FileReader("attendees.txt")))) {
            scanner.useDelimiter(",");
            while (scanner.hasNextLine()) {
                String[] fields = scanner.nextLine().split(",");
                attendees.add(new Person(fields[0], fields[1], fields[2]));
            }
        }
    }

    public static List<Person> getAttendees() {
        return new ArrayList<>(attendees);
    }
}
