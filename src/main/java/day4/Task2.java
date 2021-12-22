package day4;

import java.util.Arrays;
import java.util.Random;

public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = random.nextInt(10000);

        int max = array[0];
        int min = array[0];
        int countZero = 0;
        int sum = 0;
        for (int arr:array){
            if (arr > max)
                max = arr;
            if (arr < min)
                min = arr;
            if (arr%10 == 0) {
                countZero++;
                sum += arr;
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println("наибольший элемент массива: " + max);
        System.out.println("наименьший элемент массива: " + min);
        System.out.println("количество элементов массива, оканчивающихся на 0: " + countZero);
        System.out.println("суммa элементов массива, оканчивающихся на 0: " + sum);
    }
}
