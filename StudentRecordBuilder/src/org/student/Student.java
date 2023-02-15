package org.student;

public class Student {
    private String name;
    private Address address;
    private Programme programme;
    private int[] grades;

    // For Fun
    private String additionalInfo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Programme getProgramme() {
        return programme;
    }

    public void setProgramme(Programme programme) {
        this.programme = programme;
    }

    public int[] getGrades() {
        return grades;
    }

    public void setGrades(int[] grades) {
        this.grades = grades;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    @Override
    public String toString() {
        String gradesString = "";
        for (int i = 0; i < grades.length; i++) {
            gradesString += grades[i] + " ";
        }
        return "Student [address=" + address + ",\ngrades=" + gradesString + ",\nname=" + name + ",\nprogramme=" + programme + "]";
    }
}
