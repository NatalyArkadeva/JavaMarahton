package day3;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //System.out.println("Введите два числа");
        Scanner scanner = new Scanner(System.in);
        double divisible;
        double divider;
        while (true){
            divisible = scanner.nextDouble();
            divider = scanner.nextDouble();
            if (divider == 0) {
                break;
            }
            System.out.println(divisible/divider);
        }
    }
}
