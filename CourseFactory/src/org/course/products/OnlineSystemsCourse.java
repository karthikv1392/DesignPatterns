package org.course.products;

public class OnlineSystemsCourse implements Systems{

    private String courseName;

    @Override
    public void addCourse(String courseName) {

        this.courseName = courseName;
        System.out.println(" Added Systems Course " + courseName);
    }

    @Override
    public void enroll() {
        System.out.println(" Enrolled in Online Systems Course " + courseName);

    }


}
