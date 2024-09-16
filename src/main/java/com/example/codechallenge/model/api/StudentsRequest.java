package com.example.codechallenge.model.api;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class StudentsRequest {

    @NonNull
    private String firstName;
    @NonNull
    private String lastName;
    @NonNull
    private Boolean status;
    @NonNull
    private Integer age;
    @NonNull
    private Integer credits;
    @NonNull
    private Integer semester;
    @NonNull
    private Double average;


}
