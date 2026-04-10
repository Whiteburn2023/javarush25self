package ru.javarush.java.core.level12.task03;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        // Создаем динамический список для хранения имен гостей
        // Добавляем имена в список
        // Проверяем, содержится ли имя "Петр" в списке
        // Проверяем, содержится ли имя "Сергей" в списке

        ArrayList<String> people = new ArrayList<>(List.<String>of("Анна", "Иван", "Петр", "Мария"));
        System.out.println(people.contains("Петр"));
        System.out.println(people.contains("Сергей"));

    }
}