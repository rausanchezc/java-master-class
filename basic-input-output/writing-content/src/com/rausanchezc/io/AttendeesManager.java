package com.rausanchezc.io;

import java.util.ArrayList;
import java.util.List;

public class AttendeesManager {
    static private List<Person> attendees = new ArrayList<>();

    static {
        attendees.add(new Person("Andy", "Acker"));
        attendees.add(new Person("Thomas", "Harlow"));
        attendees.add(new Person("Caroline", "Elton"));
        attendees.add(new Person("Caroline", "Linsey"));
        attendees.add(new Person("John", "Merton"));
    }

    public static List<Person> getAttendees() {
        return new ArrayList<>(attendees);
    }
}
