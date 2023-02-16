package org.student;

public class StudentDirector {
    private StudentBuilder studentBuilder;

    public StudentDirector(StudentBuilder studentBuilder) {
        this.studentBuilder = studentBuilder;
    }

    public void construct() {
        studentBuilder.buildName("Sherlock Holmes");
        studentBuilder.buildAddress(new Address("London","UK","221B Baker St","NW1 6XE"));
        studentBuilder.buildProgramme(new Programme("CS","Computer Science","Computer Science",""));
        int[] grades = {90,80,95,85};
        studentBuilder.buildGrades(grades);
        studentBuilder.buildAdditionalDetails("I am Sherlock Holmes, I can solve this problem in O(1) time");
    }

}