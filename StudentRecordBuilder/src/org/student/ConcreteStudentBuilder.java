package org.student;

public class ConcreteStudentBuilder implements  StudentBuilder {

    private Student student;


    public ConcreteStudentBuilder()
    {
        student = new Student();
    }

    @Override
    public void buildName(String name) {
        this.student.setName(name);
    }

    @Override
    public void buildAddress(Address address) {
        student.setAddress(address);
    }

    @Override
    public void buildProgramme(Programme programme) {
        student.setProgramme(programme);
    }

    @Override
    public void buildGrades(int[] grades) {
        student.setGrades(grades);
    }

    @Override
    public void buildAdditionalDetails(String additionalInfo) {
        student.setAdditionalInfo(additionalInfo);
    }

    public Student getResult()
    {
        return this.student;
    }
}