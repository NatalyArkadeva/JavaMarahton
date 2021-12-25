package day8;

public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        long startTime1 = System.currentTimeMillis();
        for (int i = 0; i <=20000; i++){
            stringBuilder.append(" " + i);
        }
        System.out.println(stringBuilder);
        long stopTime1 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime1 - startTime1));

        String string = "";
        long startTime2 = System.currentTimeMillis();
        for (int i = 0; i <= 20000; i++){
            string += (" " + i);
        }
        System.out.println(string);
        long stopTime2 = System.currentTimeMillis();
        System.out.println("Длительность работы, в мс.: " + (stopTime2 - startTime2));
    }
}
