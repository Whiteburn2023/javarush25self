package ru.javarush.java.core.level12.task02;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список строк (названия фруктов)
        // Добавляем исходные фрукты в заданном порядке
        // Заменяем второй элемент ("Банан") на "Груша"
        // Удаляем первый элемент ("Яблоко")
        // Выводим оставшиеся фрукты, каждый на новой строке

        List<String> fruits = new ArrayList<>();
        fruits.add("Яблоко");
        fruits.add("Банан");
        fruits.add("Апельсин");

        fruits.set(1, "Груша");
        fruits.remove("Яблоко");
        for (String s : fruits){
            System.out.println(s);
        }

    }
}