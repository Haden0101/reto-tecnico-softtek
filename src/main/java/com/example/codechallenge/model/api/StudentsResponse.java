package com.example.codechallenge.model.api;

import com.example.codechallenge.model.entity.StudentsEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class StudentsResponse {

    private Integer id;
    private String firstName;
    private String lastName;
    private Boolean status;
    private Integer age;
    private Integer credits;
    private Integer semester;
    private Double average;

    public StudentsResponse(StudentsEntity entity) {
        this.id = entity.getId();
        this.firstName = entity.getFirstName();
        this.lastName = entity.getLastName();
        this.status = entity.getStatus();
        this.age = entity.getAge();
        this.credits = entity.getCredits();
        this.semester = entity.getSemester();
        this.average = entity.getAverage();
    }

    public StudentsResponse(String Message) {
        this.firstName = Message;
    }

}
