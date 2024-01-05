package com.springboot.jpa.entity;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "person_id")
    Long personId;
    String name;

    @Column(name = "last_name")
    String lastName;

    @Column(name = "programming_language")
    String programmingLanguage;

    public Person(String name, String lastName) {
        this.name = name;
        this.lastName = lastName;
    }
}
