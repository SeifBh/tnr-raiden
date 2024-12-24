package com.example.badpractices;

import java.util.ArrayList;
import java.util.List;

// Importing unnecessary libraries
import java.util.Date;
import java.util.HashMap;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class BadExample {

    private List list; // Using raw type (no generics)
    private String m1; // Poorly named variable
    private String m2;
    private int a; // Non-descriptive variable name

    public BadExample() {
        // Empty constructor, no logic inside
    }

    // Method does multiple things: violates Single Responsibility Principle
    public void processDataAndPrint() {
        // Hardcoded logic, poor practice
        if (a > 10) {
            System.out.println("Value is greater than 10");
        } else if (a < 10) {
            System.out.println("Value is less than 10");
        }

        // Process data in a non-generic way
        list = new ArrayList();
        list.add("Item 1");
        list.add(100); // Mixing data types in the list

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    // No parameter validation, open to potential bugs
    public String formatString(String input) {
        return "Formatted: " + input.toUpperCase();
    }

    // Violates the Open-Closed Principle: logic is hardcoded, difficult to extend
    public void sendMessage() {
        if (m1.equals("email")) {
            System.out.println("Sending email...");
        } else if (m1.equals("sms")) {
            System.out.println("Sending SMS...");
        }
    }

    // Unnecessary method, violates YAGNI (You Aren't Gonna Need It)
    public void unusedMethod() {
        System.out.println("This method is never used!");
    }

    // Breaks the Liskov Substitution Principle by forcing logic inside a method not related to the class' core purpose
    public void performUnrelatedTask() {
        Date date = new Date(); // Date is imported but not really needed in this class
        System.out.println("Performing an unrelated task on " + date);
    }
}
