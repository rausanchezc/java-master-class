package com.rausanchezc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWriterHandlingIOException {

    /**
     * Handling all IOException
     **/

    public static void main(String[] args) {
        List<Person> attendees  = AttendeesManager.getAttendees();
        FileWriter attendeesFile = null;
        try {
            attendeesFile = new FileWriter("attendees-handling.txt");
            for (Person attendee: attendees) {
                attendeesFile.write(attendee.getUuid() +"," +attendee.getFirstName() + "," + attendee.getLastName() + "\n");
            }
        } catch (IOException e) {
            System.out.println("Error:" + e.getMessage());
        } finally {
            try {
                if (attendeesFile != null) {
                    attendeesFile.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
