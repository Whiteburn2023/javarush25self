package ru.javarush.java.core.level11.task15;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Solution {

    public static void extractFirstLineFromData(String dataFile) throws FileNotFoundException, IOException {
        // Создаем FileReader для чтения файла
        // Оборачиваем FileReader в BufferedReader для построчного чтения
        // Читаем первую строку из файла
        // Закрываем BufferedReader (он автоматически закроет и FileReader)
        // Выводим первую строку на экран (опционально, если требуется)
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(dataFile))){
            bufferedReader.readLine();
        }

    }

    public static void main(String[] args) {
        
    }
}