package day16;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        File file1 = new File("file1.txt");
        File file2 = new File("file2.txt");

        Random random = new Random();
        List<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            randomNumbers.add(random.nextInt(101));
        }

        try {
            PrintWriter pw = new PrintWriter(file1);
            for (Integer randomNumber : randomNumbers) {
                pw.print(randomNumber + " ");
            }
            pw.close();

            List<Double> averageNumbers = new ArrayList<>();
            Scanner scanner = new Scanner(file1);
            String line = scanner.nextLine();
            String[] randomNumber1 = line.split(" ");

            int n = 20;
            for (int k = 0; k < randomNumber1.length; k += n) {
                double sum = 0;
                for (int j = k; j < n + k; j++) {
                    sum += Double.parseDouble(randomNumber1[j]);
                    if (n + k > randomNumber1.length) {
                        break;
                    }
                }
                averageNumbers.add(sum / n);
            }
            scanner.close();

            PrintWriter pw1 = new PrintWriter(file2);
            for (Double averageNumber : averageNumbers) {
                pw1.print(averageNumber + " ");
            }
            pw.close();
            pw1.close();

        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }

        System.out.println(printResult(file2));
    }

    public static int printResult(File file) {
        double sum = 0;
        try {
            Scanner scanner = new Scanner(file);
            String line = scanner.nextLine();
            String[] averages = line.split(" ");
            for (String average : averages) {
                sum += Double.parseDouble(average);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return (int) sum;
    }
}
