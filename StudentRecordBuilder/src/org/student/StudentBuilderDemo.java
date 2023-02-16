package org.student;

public class StudentBuilderDemo {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = new ConcreteStudentBuilder();
        StudentDirector studentDirector = new StudentDirector(studentBuilder);
        studentDirector.construct();

        Student student = ((ConcreteStudentBuilder) studentBuilder).getResult();
        System.out.println(student);
        System.out.println(student.getAdditionalInfo());
    }
}