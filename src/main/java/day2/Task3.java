package day2;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        //System.out.println("Введите два числа a и b (a < b)");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        if(a >= b) System.out.println("Некорректный ввод");

        while(a < b) {
            int i = ++a;
            if (i % 5 == 0 && i % 10 != 0) {
                System.out.print(i + " ");
            }
        }
    }
}
