package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;

import static java.nio.charset.StandardCharsets.UTF_8;

public class Main {
    public static void main(String[] args) throws IOException {
        try {   // changed file

            Scanner input = new Scanner(System.in);
            String path;
            System.out.println("Введите путь к файлу: ");
            path = input.nextLine();

            List<String> lines = Files.readAllLines(Paths.get(path), UTF_8);
            for (String s : lines) {
                System.out.println(s);
            }
        }
        catch (NoSuchFileException exception) {
            System.out.println("Файл не найден");

        }
    }
}
