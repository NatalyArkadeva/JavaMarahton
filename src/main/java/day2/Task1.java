package day2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //System.out.println("Введите количество этажей в здании");
        Scanner scanner = new Scanner(System.in);
        int floorCount = scanner.nextInt();

        if (floorCount > 0 && floorCount <= 4){
            System.out.println("Малоэтажный дом");
        } else if (floorCount > 4 && floorCount <= 8) {
            System.out.println("Среднеэтажный дом");
        } else if (floorCount > 8) {
            System.out.println("Многоэтажный дом");
        } else {
            System.out.println("Ошибка ввода");
        }
    }
}
