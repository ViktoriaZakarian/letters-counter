package by.itacademy.viktoriazakarian.marathon0510;

import java.util.HashMap;
import java.util.Map;

public class LettersCounter {
    public static void main(String[] args) {
        String text = "С момента выхода AirPods 3 прошло три года. " +
                "Недавно им на смену Apple выпустила наушники четвертого поколения, " +
                "причем сразу в двух модификациях — с шумодавом и без него. " +
                "Сегодня тестируем AirPods 4 с системой шумоподавления и сравниваем их с предшественником. " +
                "Если коротко: все плохо.";
        count(text);
    }

    public static void count(String text) {
        text = text.toLowerCase();
        Map<Character, Integer> counter = new HashMap<>();
        char[] array = text.toCharArray();
        for (char letter : array) {
            if (Character.isLetter(letter)) {
                counter.put(letter, counter.getOrDefault(letter, 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : counter.entrySet()) {
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
}
