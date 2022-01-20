package day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task1 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/dushi.txt");

        try {
            Scanner scanner = new Scanner(file);
            scanner.useDelimiter("[»«<>…N„“.,:;()?!\"\\s–+]");

            Map<String, Integer> wordAndCount = new HashMap<>();

            List<String> wordsDushi = new ArrayList<>();
            while (scanner.hasNext()) {
                wordsDushi.add(scanner.next());
            }
            scanner.close();

            for (String w : wordsDushi) {
                if (wordAndCount.containsKey(w)) {
                    wordAndCount.put(w, wordAndCount.get(w) == null ? 1 : wordAndCount.get(w) + 1);
                } else if (!w.isEmpty()) {
                    wordAndCount.put(w, 1);
                }
            }
            System.out.println(wordAndCount);
            System.out.println("Слово 'Чичиков' повторяется " + wordAndCount.get("Чичиков") + " раз.");

            findMostUsedWords(wordAndCount);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
    }

    public static void findMostUsedWords(Map<String, Integer> map) {
        for (int count = 0; count < 101; count++) {
            int maxValueInMap = Collections.max(map.values());
            for (Map.Entry<String, Integer> entry : map.entrySet()) {
                if (entry.getValue() == maxValueInMap) {
                    System.out.println(entry.getKey() + " : " + entry.getValue());
                    map.put(entry.getKey(), 0);
                }
            }
        }
    }
}
