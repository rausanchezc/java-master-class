package com.rausanchezc.nio;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class ReadingFiles {
    public static void main(String[] args) {
        try {
            Path dataFilePath = FileSystems.getDefault().getPath("data.txt");
            List<String> lines = Files.readAllLines(dataFilePath);
            for(String line: lines ){
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
