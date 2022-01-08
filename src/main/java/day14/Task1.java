package day14;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers1");
        printSumDigits(file);
    }

    public static void printSumDigits(File file) {
        try {
            Scanner scanner = new Scanner(file);

            String line = scanner.nextLine();
            String[] numberString = line.split(" ");

            if (numberString.length != 10) {
                throw new IOException();
            } else {
                int sum = 0;
                for (String number : numberString) {
                    sum += Integer.parseInt(number);
                }
                System.out.println(sum);

            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}
