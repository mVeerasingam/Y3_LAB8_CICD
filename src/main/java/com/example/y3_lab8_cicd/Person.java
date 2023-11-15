package com.example.y3_lab8_cicd;

import jakarta.validation.constraints.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Person {
    @NotBlank(message = "Name cannot be blank")
    @Size(min = 2, max = 50, message = "Name must be between2 and 50 characters")
    private String name;

    @NotBlank(message = "You must enter job title")
    private String title;

//    @Digits(integer = 8, fraction = 0)
    @NotBlank(message = "You must enter an employee ID")
    private String employeeId;

    @Min(value = 0, message = "Age must be greater than or equal to 0")
    private int age;

    @Email(message = "Invalid email address")
    private String email;

    @NotBlank(message = "Position cannot be blank")
    private String position;

    @NotBlank(message = "You must enter your department")
    private String department;
}
