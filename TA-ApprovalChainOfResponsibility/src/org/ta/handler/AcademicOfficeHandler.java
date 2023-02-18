package org.ta.handler;

import org.ta.Application;

import java.util.Scanner;

public class AcademicOfficeHandler implements ApplicationHandler {
    public void processApplication(Application application) {
        System.out.println("Academic Office");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you approve this application? (1/0): ");
        int approve = scanner.nextInt();
        application.setRejected(approve == 0);

        // Perform application processing logic
        System.out.println("Application processed by academic office.");
        // If application is rejected, notify the student and terminate the chain
        if (application.isRejected()) {
            System.out.println("Application rejected.");
            return;
        }
        // If application is approved, notify the student and terminate the chain
        System.out.println("Application approved.");
    }
}