package org.course.products;

public class RegularSystemsCourse implements  Systems{

    private String courseName;

    @Override
    public void addCourse(String courseName) {
        this.courseName =  courseName;
        System.out.println(" Added Regular Systems Course " + courseName);
    }

    @Override
    public void enroll() {
        System.out.println(" Enrolled in Regular Systems Course " + courseName);
    }
}
