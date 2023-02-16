package org.student;

public interface  StudentBuilder {

    public abstract void buildName(String name);

    public abstract void buildAddress(Address address);

    public abstract void buildProgramme(Programme programme);

    public abstract void buildGrades(int[] grades);

    public abstract void buildAdditionalDetails(String additionalInfo);

}