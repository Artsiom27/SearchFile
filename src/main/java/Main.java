package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {   // changed file

            Scanner input = new Scanner(System.in);
            String path;
            System.out.println("Введите путь к файлу: ");
            path = input.nextLine();

            FileInputStream fileInputStream = new FileInputStream(path);
            int i;
            while ((i = fileInputStream.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (FileNotFoundException exception) {
            System.out.println("Файл не найден");
        }
    }
}
