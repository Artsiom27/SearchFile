package com.company;

import org.apache.commons.io.IOUtils;

import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            Scanner input = new Scanner(System.in);
            String path;
            System.out.println("Введите путь к файлу: ");
            path = input.nextLine();

            //public void givenFileName_whenUsingFileUtils_thenFileData();
            //{
            // String expectedData = path;

            FileInputStream fis = new FileInputStream(path);
            String data = IOUtils.toString(fis, "UTF-8");
            System.out.println(data);

            // assertEquals(expectedData, data.trim());
        } catch (FileNotFoundException exception) {
            System.out.println("Файл не найден");
        }
    }
}





