package com.ua.robot.hw27;

import java.io.*;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Main {
    private static final String FILE_NAME = "file.txt";

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(FILE_NAME))))
        {
            String content = readClientInputMessage(reader);
            writeFile(writer, content);
            String textFromFile = readFile(FILE_NAME);
            System.out.println("Text from the file: " + textFromFile);

        } catch (IOException e) {
            throw new RuntimeException(e);
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
