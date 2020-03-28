package com.rausanchezc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterTryWithResources {

    /**
     * try-with-resources https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html
     **/

    public static void main(String[] args) throws IOException {
        List<Person> attendees  = AttendeesManager.getAttendees();
        try( FileWriter attendeesFile = new FileWriter("attendees-try-resources.txt")) {
            for (Person attendee: attendees) {
                attendeesFile.write(attendee.getUuid() +"," +attendee.getFirstName() + "," + attendee.getLastName() + "\n");
            }
        }
    }
}
