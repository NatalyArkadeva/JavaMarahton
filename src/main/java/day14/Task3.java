package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("people");
        System.out.println(parseFileToObjList(file));
    }

    public static List<Person> parseFileToObjList(File file) {
        List<Person> peoples = new ArrayList<>();
        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] people = line.split(",");
                for (String info : people) {
                    String[] nameAge = line.split(" ");
                    int age = Integer.parseInt(nameAge[1]);
                    if (age < 0) {
                        try {
                            throw new IllegalArgumentException();
                        } catch (IllegalArgumentException e) {
                            System.out.println("Некорректный входной файл");
                        }
                        return null;

                    }
                    peoples.add(new Person(nameAge[0], age));
                }
                //peoples.add(new Person(info2[0],info2[1]));
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        return peoples;
    }
}
