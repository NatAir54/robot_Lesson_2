package com.ua.robot.hw27;

import java.io.*;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Main {
    private static final String FILE_NAME = "file.txt";
    private static final String TEXT = "Using BufferedWriter Class. " +
            "It is used to write text to a character-output stream. " +
            "It has a default buffer size, but a large buffer size can be assigned. " +
            "It is useful for writing characters, strings, and arrays. " +
            "It is better to wrap this class with any writer class for writing data to a file if no prompt output is required.";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILE_NAME))))
        {
            String content = readClientInputMessage(reader);
            writeFile(writer, content);
            String textFromFile = readFile(FILE_NAME);
            System.out.println("Text from the file: " + textFromFile);

            // writing text into file
            writeFile(writer, TEXT);
            textFromFile = readFile(FILE_NAME);
            System.out.println("Text from the file: " + textFromFile);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readClientInputMessage(BufferedReader reader) throws IOException {
        System.out.println("Enter your message please:");
        return reader.readLine();
    }

    private static void writeFile(BufferedWriter writer, String content) throws IOException {
        writer.write(content);
        writer.flush();
    }

    private static String readFile(String path) throws IOException {
        File file = new File(path);
        StringBuilder result = new StringBuilder();
        try (Stream<String> linesStream = Files.lines(file.toPath())) {
            linesStream.forEach(result::append);
        }
        return result.toString();
    }
}
