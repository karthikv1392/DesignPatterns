package org.course.factory;//Author: Karthik Vaidhyanathan


import org.course.products.Systems;
import org.course.products.Theory;

public abstract class CourseFactory {

    public abstract Systems CreateSystemCourses();
    public abstract Theory CreateTheoryCourses();
    public abstract void CreateElectiveCourses();

}
