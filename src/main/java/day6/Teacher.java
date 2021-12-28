package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    Random random = new Random();

    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student){
        int grade = random.nextInt(4)+2;
        System.out.println(grade);

        switch(grade){
            case 2:
                System.out.println("Преподаватель " + name + " оценил студента с именем "+
                        student.getName() + " по предмету " + subject + " на оценку неудовлетворительно.");
                break;
            case 3:
                System.out.println("Преподаватель " + name + " оценил студента с именем " +
                                    student.getName() + " по предмету " + subject + " на оценку удовлетворительно.");
                break;
            case 4:
                System.out.println("Преподаватель " + name + " оценил студента с именем " +
                        student.getName() + " по предмету " + subject + " на оценку хорошо.");
                break;
            default:
                System.out.println("Преподаватель " + name + " оценил студента с именем " +
                        student.getName() + " по предмету " + subject + " на оценку отлично.");

        }
    }

}
