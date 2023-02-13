package org.course.factory;

import org.course.products.OnlineSystemsCourse;
import org.course.products.OnlineTheoryCourse;
import org.course.products.Systems;

public class OnlineCourseFactory extends CourseFactory {


    @Override
    public OnlineSystemsCourse CreateSystemCourses() {
        return new OnlineSystemsCourse();
    }

    @Override
    public OnlineTheoryCourse CreateTheoryCourses() {
        return new OnlineTheoryCourse();
    }

    @Override
    public void CreateElectiveCourses(){
        
    }
}
