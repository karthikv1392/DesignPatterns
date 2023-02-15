package org.student;

public class ConcreteStudentBuilder extends StudentBuilder {

    @Override
    public void buildName() {
        this.student.setName("Sherlock Holmes");
    }

    @Override
    public void buildAddress() {
        Address address = new Address();
        address.setCity("London");
        address.setState("UK");
        address.setStreet("221B Baker St");
        address.setZip("NW1 6XE");
        student.setAddress(address);
    }

    @Override
    public void buildProgramme() {
        Programme programme = new Programme();
        programme.setName("Computer Science");
        programme.setType("Bachelor");
        programme.setCode("CS");
        programme.setDepartment("Computer Science");
        student.setProgramme(programme);
    }

    @Override
    public void buildGrades() {
        student.setGrades(new int[] {90, 80, 95, 85});
    }

    @Override
    public void buildAdditionalDetails() {
        student.setAdditionalInfo("I am sherlock holmes, I can solve this problem in O(1) time");
    }
}
