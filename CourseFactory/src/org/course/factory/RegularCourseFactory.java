package org.course.factory;

import org.course.products.*;

public class RegularCourseFactory extends CourseFactory {


    @Override
    public Systems CreateSystemCourses() {
        return new RegularSystemsCourse();
    }

    @Override
    public Theory CreateTheoryCourses() {
        return new RegularTheoryCourse();
    }

    @Override
    public void CreateElectiveCourses() {

    }
}
