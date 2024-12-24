package com.safecode.models;

import java.util.List;

import lombok.*;

/**
 * @author madhankumar
 */
@Setter
@Getter
@ToString
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChatRequestDemo {
    private String model;
    @ToString()
    private List<?> messages;
    private int n;
    @SuppressWarnings()
    private double temperature;
}
