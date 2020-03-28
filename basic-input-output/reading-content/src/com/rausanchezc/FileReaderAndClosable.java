package com.rausanchezc;

import java.util.List;

public class FileReaderAndClosable {
    public static void main(String[] args) {
        List<Person> attendees = AttendeesManager.getAttendees();
        System.out.println("Listing attendees from file:");
        for(Person attendee: attendees) {
            System.out.println(attendee);
        }
    }
}
