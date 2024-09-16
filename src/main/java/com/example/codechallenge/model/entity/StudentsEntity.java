package com.example.codechallenge.model.entity;

import com.example.codechallenge.model.api.StudentsRequest;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentsEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String firstName;
    private String lastName;
    private Boolean status;
    private Integer age;

    public StudentsEntity(StudentsRequest request) {
        this.firstName = request.getFirstName();
        this.lastName = request.getLastName();
        this.status = true;
        this.age = request.getAge();
    }
}
