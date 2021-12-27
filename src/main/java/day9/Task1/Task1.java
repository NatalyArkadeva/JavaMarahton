package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Tom", "3a");
        Teacher teacher = new Teacher("Bob", "Math");

        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();

    }
}
