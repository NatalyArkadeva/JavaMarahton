package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        File file = new File("numbers1");
        printResult(file);
    }

    public static void printResult(File file){
        try{
            if (file.length() == 0){
                throw new IOException();
            }
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] numbers = line.split(" ");
            int sum = 0;
            for(String number:numbers){
                sum += Integer.parseInt(number);
            }
            double average = (double) sum/ numbers.length;
            System.out.printf(average + " --> " + "%.3f", average);

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Некорректный входной файл");
        }
    }
}

