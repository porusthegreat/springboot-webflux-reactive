package com.porus.ReactiveAPIDemo.models;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@ToString
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = {"id", "name", "department"})
@Document(value = "users")
public class User {
    @Id
    private String id;
    private String name;
    private int age;
    private String salary;
    private String department;
}
