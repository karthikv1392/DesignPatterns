package org.student;

public class StudentDirector {
    private StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public Student construct() {
        studentBuilder.createNewStudent();
        studentBuilder.buildName();
        studentBuilder.buildAddress();
        studentBuilder.buildProgramme();
        studentBuilder.buildGrades();
        studentBuilder.buildAdditionalDetails();
        return studentBuilder.getStudent();
    }
}
