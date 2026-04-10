package ru.javarush.java.core.level11.task19;

public class Solution {

    public static void main(String[] args) {
        // Вызов метода calculateReportData из main
           calculateReportData();

    }

    static int calculateReportData() {
        return processRawNumbers();
    }

    static int processRawNumbers() {
        return 100/0;
    }

}