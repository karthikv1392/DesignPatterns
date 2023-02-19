package org.ta.handler;

import org.ta.Application;

import java.util.Scanner;

public class TAChairHandler implements ApplicationHandler {
    private ApplicationHandler nextHandler;

    public void setNextHandler(ApplicationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void processApplication(Application application) {
        System.out.println("TA Chair");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you approve this application? (1/0): ");
        int approve = scanner.nextInt();
        application.setRejected(approve == 0);

        // Perform application processing logic
        System.out.println("Application processed by TA chair.");
        // If application is rejected, pass it back to the advisor for revision
        if (application.isRejected()) {
            System.out.println("Sending application back to advisor for revision.");
            return;
        }
        // If application is approved, pass it to the next handler in the chain
        if (nextHandler != null) {
            nextHandler.processApplication(application);
        }
    }
}