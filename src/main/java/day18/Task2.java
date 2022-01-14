package day18;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(count7(775775774));
    }

    public static int count7(int n) {

        if (n < 1)
            return 0;

        if (n % 10 == 7)
            return count7(n / 10) + 1;


        return count7(n / 10);
    }
}
