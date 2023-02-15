package org.student;

public abstract class StudentBuilder {

    protected Student student;

    public Student getStudent() {
        return this.student;
    }

    public void createNewStudent() {
        this.student = new Student();
    }

    public abstract void buildName();
    public abstract void buildAddress();
    public abstract void buildProgramme();
    public abstract void buildGrades();
    public abstract void buildAdditionalDetails();
}
