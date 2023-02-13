import org.course.factory.CourseFactory;
import org.course.factory.OnlineCourseFactory;
import org.course.products.Systems;
import org.course.products.Theory;

public class Application {

    private Systems systemCourse;
    private Theory theoryCourse;

    public Application(CourseFactory cf)
    {
       systemCourse = cf.CreateSystemCourses();
       theoryCourse = cf.CreateTheoryCourses();
    }




    public void createCourse(String type, String title)
    {
       if (type.contains("Systems"))
       {
           systemCourse.addCourse(title);
       }
       else if (type.contains("theory"))
        {
           theoryCourse.addCourse(title);
        }
    }


}
