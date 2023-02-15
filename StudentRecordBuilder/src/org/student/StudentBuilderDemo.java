package org.student;

public class StudentBuilderDemo {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new ConcreteStudentBuilder();
        StudentDirector studentDirector = new StudentDirector(studentBuilder);
        Student student = studentDirector.construct();
        System.out.println(student);
        System.out.println(student.getAdditionalInfo());
    }
}
