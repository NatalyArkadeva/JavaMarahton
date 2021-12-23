package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Тимур Борисович", "Химия");
        Student student = new Student("Никита");

        teacher.evaluate(student);
    }
}
