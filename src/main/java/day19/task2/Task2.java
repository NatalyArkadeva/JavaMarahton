package day19.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author Neil Alishev
 */
public class Task2 {
    public static void main(String[] args) {
        File file = new File("src/main/resources/taxi_cars.txt");
        Map<Integer, Point> taxiLocation = new HashMap<>();
        makeMapIndexAndTaxiLocation(file, taxiLocation);
        searchAllCarsInTheSquare(taxiLocation);

    }

    public static void makeMapIndexAndTaxiLocation(File file, Map map) {
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                String[] cars = line.split(" ");
                if (cars.length != 3) {
                    throw new IllegalArgumentException();
                }
                for (int i = 0; i < cars.length; i++) {
                    map.put(Integer.parseInt(cars[0]), new Point(Integer.parseInt(cars[1]), Integer.parseInt(cars[2])));
                }
            }
            scanner.close();
            System.out.println(map);
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный файл");
        }

    }

    public static void searchAllCarsInTheSquare(Map<Integer, Point> map) {
        Scanner scanner = new Scanner(System.in);
        int x1 = -1;
        int y1 = 0;
        int x2 = 0;
        int y2 = -2;
        while (Math.abs(x1 - x2) != (Math.abs(y1 - y2))) {
            System.out.println("Введите координаты диагонали квадрата(x1, y1, x2, y2): 4 целых числа в диапазоне от 0 до 99");
            x1 = scanner.nextInt();
            y1 = scanner.nextInt();
            x2 = scanner.nextInt();
            y2 = scanner.nextInt();
        }
        scanner.close();

        int count = 0;
        for (Map.Entry<Integer, Point> entry : map.entrySet()) {
            if (entry.getValue().getX() > x1 && entry.getValue().getX() < x2 && entry.getValue().getY() > y1 && entry.getValue().getY() < y2) {
                System.out.println(entry.getKey());
                count++;
            }
        }

        System.out.println("Общее количество машин в квадрате: " + count);
    }

}

