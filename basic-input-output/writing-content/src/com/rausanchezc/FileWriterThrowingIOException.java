package com.rausanchezc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterThrowingIOException {

    /**
     * Throwing IOException
     **/

    public static void main(String[] args) throws IOException {
        List<Person> attendees  = AttendeesManager.getAttendees();

        FileWriter attendeesFile = null;
        try {
            attendeesFile = new FileWriter("attendees-throwing.txt");
            for (Person attendee: attendees) {
                attendeesFile.write(attendee.getUuid() +"," +attendee.getFirstName() + "," + attendee.getLastName() + "\n");
            }
        } finally {
            if (attendeesFile != null) {
                attendeesFile.close();
            }
        }

    }
}
