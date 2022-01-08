package day15;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        String separator = File.separator;
        String path = "src" + separator + "main" + separator + "resources" + separator + "shoes.csv";
        String path1 = "src" + separator + "main" + separator + "resources" + separator + "missing_shoes.txt";
        File file = new File(path);
        File file1 = new File(path1);

        try {
            if (file.length() == 0) {
                throw new IllegalArgumentException();
            }
            PrintWriter pw = new PrintWriter(file1);
            for (String shoe : makeAListMissingShoes(file)) {
                pw.println(shoe);
            }

            pw.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }
    }

    public static List<String> makeAListMissingShoes(File file) {
        List<String> shoes = new ArrayList<>();

        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] allShoes = line.split(";");
                if (allShoes.length != 3) {

                    throw new IllegalArgumentException();

                }
                if (Integer.parseInt(allShoes[2]) == 0) {
                    shoes.add(line);

                }
                if (allShoes[2].isEmpty()) {

                    throw new IllegalArgumentException();

                }
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный входной файл");
        }

        return shoes;
    }
}
