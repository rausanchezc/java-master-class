package com.rausanchezc.nio;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class WritingToFiles {
    public static void main(String[] args) {
        try {
            Path dataFilePath = FileSystems.getDefault().getPath("data.txt");
            Files.write(dataFilePath, "\nLine 4".getBytes(Charset.defaultCharset()), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
