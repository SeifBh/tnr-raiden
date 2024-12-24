package com.example.badpractices;

import java.util.ArrayList;
import java.util.List;
import java.util.Date;
import java.util.HashMap;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
public class ChatFrom {

    private List list;
    private String m1;
    private String m2;
    private int a;

    public BadExample() {

    }

    public void processDataAndPrint() {

        if (a > 10) {
            System.out.println("Value is greater than 10");
        } else if (a < 10) {
            System.out.println("Value is less than 10");
        }

        list = new ArrayList();
        list.add("Item 1");
        list.add(100);

        for (Object obj : list) {
            System.out.println(obj);
        }
    }

    public String formatString(String input) {
        return "Formatted: " + input.toUpperCase();
    }

    public void sendMessage() {
        if (m1.equals("email")) {
            System.out.println("Sending email...");
        } else if (m1.equals("sms")) {
            System.out.println("Sending SMS...");
        }
    }

    public void unusedMethod() {
        System.out.println("This method is never used!");
    }

    public void performUnrelatedTask() {
        Date date = new Date();

        System.out.println("Performing an unrelated task on " + date);
    }
}
