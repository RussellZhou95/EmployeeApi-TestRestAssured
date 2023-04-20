package com.example.employeeapi.entity;



import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "EMPLOYEE")
@Data
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    @Id
    @Column(name = "id")
    private Long id;

    @Column(name="name", nullable = false, unique = true)
    private String name;

    @Column(name="age", nullable = false, unique = true)
    private int age;

    @Column(name="title", nullable = false, unique = true)
    private String title;

    public Employee(String name, int age, String title) {
        this.name = name;
        this.age = age;
        this.title = title;
    }
}
