package com.ua.robot.hw28;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class Main {
    static final Path PATH = Paths.get("C:/Users/User/IdeaProjects/robot_homework/file.txt");

    private static final String TEXT = "Java Files class contains static methods that work on files and directories. " +
            "This class is used for basic file operations like create, read, write, copy and delete the files or directories of the file system.";

    public static void main(String[] args) {
        try {
            // writing text into file, read it
            System.out.println("Writing text into file:");
            writeFile(PATH, TEXT);
            String textFromFile = readFile(PATH);
            System.out.println("Text from the file: " + textFromFile + "\n");

            // get input from client, write into file and read it
            String content = getClientInput();
            writeFile(PATH, content);
            String clientInput = readFile(PATH);
            System.out.println("Client input: " + clientInput);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String readFile(Path value) throws IOException {
        byte[] buffer = Files.readAllBytes(value);
        return new String(buffer);
    }

    private static void writeFile(Path value, String content) throws IOException {
        Files.write(value, content.getBytes());
    }

    private static String getClientInput() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter your message please:");
            return reader.readLine();
        }
    }
}
