package day4;

import java.util.Arrays;
import java.util.Random;

public class Task4 {
    public static void main(String[] args) {
        int[] array = new int[100];
        Random random = new Random();
        for(int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10000);
        }
        System.out.println(Arrays.toString(array));
        int maxSum = 0;
        int firstMaxSumIndex = 0;
        for (int i = 0; i < array.length-3; i++){
            if (array[i] + array[i+1] + array[i+2] < array[i+1] + array[i+2] + array[i+3]) {
                maxSum = array[i + 1] + array[i + 2] + array[i + 3];
                firstMaxSumIndex = i+1;

            }
        }
        System.out.println(maxSum);
        System.out.println(firstMaxSumIndex);

    }
}
