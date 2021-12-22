package day4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            array[i] = (int)(Math.random()*10);
        }
        int more8 = 0;
        int one = 0;
        int evenNumber = 0;
        int oddNumber = 0;
        int sum = 0;
        for (int arr:array){
            System.out.print(arr + " ");
            if (arr > 8)
                more8++;
            if (arr == 1)
                one++;
            if (arr%2 == 0) {
                evenNumber++;
            } else {
                oddNumber++;
            }
            sum += arr;
        }
        System.out.println();
        System.out.println("Длина массива: " + array.length);
        System.out.println("Количество чисел больше 8: " + more8);
        System.out.println("Количество чисел равных 1: " + one);
        System.out.println("Количество четных чисел: " + evenNumber);
        System.out.println("Количество нечетных чисел: " + oddNumber);
        System.out.println("Сумма всех элементов массива: " + sum);
        //System.out.println(Arrays.toString(array));

    }
}
