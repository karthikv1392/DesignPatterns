package org.course.products;

public class OnlineTheoryCourse implements Theory {

    private String courseName;
    @Override
    public void addCourse(String courseName) {

        this.courseName = courseName;
        System.out.println(" Added online theory course " + courseName);


    }

    @Override
    public void enroll() {
        System.out.println(" Enrolled in Online Theory Course " + courseName);
    }
}
