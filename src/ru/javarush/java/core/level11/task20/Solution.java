package ru.javarush.java.core.level11.task20;

public class Solution {
    public static void main(String[] args) {
        // Начальная точка программы
        processInitialRequest();

    }
    static int processInitialRequest(){
        return handleIntermediateStep();
    }
    static int handleIntermediateStep(){
        return executeFinalAction();
    }
    static int executeFinalAction(){
        int[] temporaryData = {1,2};
        return temporaryData[10];
    }

}