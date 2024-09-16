package com.example.codechallenge.mapper;

import com.example.codechallenge.model.api.StudentsRequest;
import com.example.codechallenge.model.api.StudentsResponse;
import com.example.codechallenge.model.entity.StudentsEntity;

public class StudentsMapper {

    private StudentsMapper() {}

    /**
     * Metodo que convierte el Request a la Entidad.
     * @param request {@link StudentsRequest}
     * @return {@link StudentsEntity}
     */
    public static StudentsEntity mapEntity(StudentsRequest request) {
        StudentsEntity response = new StudentsEntity();
        response.setFirstName(request.getFirstName());
        response.setLastName(request.getLastName());
        response.setStatus(true);
        response.setAge(request.getAge());
        response.setCredits(request.getCredits());
        response.setSemester(request.getSemester());
        response.setAverage(request.getAverage());
        return response;
    }

    /**
     * Metodo que convierte la Entidad al Response.
     * @param  studentsEntity {@link StudentsEntity}
     * @return {@link StudentsResponse}
     */
    public static StudentsResponse mapResponse(StudentsEntity studentsEntity) {
        StudentsResponse response = new StudentsResponse();
        response.setId(studentsEntity.getId());
        response.setFirstName(studentsEntity.getFirstName());
        response.setLastName(studentsEntity.getLastName());
        response.setStatus(studentsEntity.getStatus());
        response.setAge(studentsEntity.getAge());
        response.setCredits(studentsEntity.getCredits());
        response.setSemester(studentsEntity.getSemester());
        response.setAverage(studentsEntity.getAverage());
        return response;
    }
}
