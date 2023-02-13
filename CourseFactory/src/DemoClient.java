import org.course.factory.CourseFactory;
import org.course.factory.OnlineCourseFactory;
import org.course.factory.RegularCourseFactory;

import java.util.Scanner;

public class DemoClient {


    public static void main(String[] args) {

        CourseFactory factory;
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Online or Offline ");
        String choice = sc.nextLine();

        System.out.println(" Mention the type of course ");
        System.out.println("Systems Course");
        System.out.println("Theory Course");
        String type = sc.nextLine();

        System.out.println(" Title of the course ");
        String title = sc.nextLine();

        if (choice.contains("regular"))
        {
            factory = new RegularCourseFactory();
        }
        else {
            factory = new OnlineCourseFactory();
        }
       Application app = new Application(factory);
       app.createCourse(type,title);
    }
}
