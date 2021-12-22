package day4;

import java.util.Arrays;
import java.util.Random;

public class Task3 {
    public static void main(String[] args) {
        int[][] array = new int[12][8];
        Random random = new Random();
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = random.nextInt(50);
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        int[] sumArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                sumArray[i] += array[i][j];

            }
            System.out.print(sumArray[i] + " ");
        }
        int maxIndex =0;
        int maxSumString = sumArray[0];
        for (int i = 0; i < sumArray.length; i++){
            if(maxSumString <= sumArray[i]) {
                maxSumString = sumArray[i];
                maxIndex = i;
            }

        }
        System.out.println();
        System.out.println(maxIndex + " индекс строки, сумма чисел в которой максимальна");
    }



}
