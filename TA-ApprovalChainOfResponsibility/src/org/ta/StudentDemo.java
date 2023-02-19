package org.ta;

import org.ta.handler.*;

public class StudentDemo {
    public static void main(String[] args) {
        // Create application
        Application application = new Application();
        // Create handlers
        InstructorHandler instructorHandler = new InstructorHandler();
        AdvisorHandler advisorHandler = new AdvisorHandler();
        TAChairHandler taChairHandler = new TAChairHandler();
        AcademicOfficeHandler academicOfficeHandler = new AcademicOfficeHandler();
        // Set up the chain of responsibility
        instructorHandler.setNextHandler(advisorHandler);
        advisorHandler.setNextHandler(taChairHandler);
        taChairHandler.setNextHandler(academicOfficeHandler);
        // Process application
        instructorHandler.processApplication(application);
    }
}
