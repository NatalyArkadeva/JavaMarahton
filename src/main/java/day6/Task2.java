package day6;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Airplane plane = new Airplane("Boeing", 2015, 70000, 176000);
        plane.setYear(2020);
        plane.setLength(85500);
        for (int i = 0; i < 2; i++) {
            int n = scanner.nextInt();
            plane.fillUp(n);
        }
       plane.info();
    }
}
