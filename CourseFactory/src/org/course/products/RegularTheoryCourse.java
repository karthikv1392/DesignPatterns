package org.course.products;

public class RegularTheoryCourse implements Theory {

    private String courseName;

    @Override
    public void addCourse(String courseName) {
        this.courseName = courseName;
        System.out.println(" Added theory course " +  courseName);
    }

    @Override
    public void enroll() {
        System.out.println(" Enrolled in Regular Theory Course " + courseName);
    }
}
