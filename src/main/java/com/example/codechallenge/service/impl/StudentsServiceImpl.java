package com.example.codechallenge.service.impl;

import com.example.codechallenge.mapper.StudentsMapper;
import com.example.codechallenge.model.api.StudentsRequest;
import com.example.codechallenge.model.api.StudentsResponse;
import com.example.codechallenge.model.entity.StudentsEntity;
import com.example.codechallenge.model.exception.ResponseExceptionDefault;
import com.example.codechallenge.repository.StudentsRepository;
import com.example.codechallenge.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class StudentsServiceImpl implements StudentsService {

    @Autowired
    private StudentsRepository repository;

    /**
     * Metodo que registra al usuario.
     * @param request {@link StudentsRequest}
     */
    @Override
    public void save(StudentsRequest request) {
        StudentsEntity sr = new StudentsEntity();
        sr.setFirstName(request.getFirstName());
        sr.setLastName(request.getLastName());
        sr.setStatus(request.getStatus());
        sr.setAge(request.getAge());
        sr.setCredits(request.getCredits());
        sr.setSemester(request.getSemester());
        sr.setAverage(request.getAverage());
        repository.save(sr);
    }


    /**
     * Metodo que retorna el listado de usuarios
     *
     * @return {@link StudentsResponse[]}
     */
    @Override
    public List<StudentsResponse> users() {
        return repository.findAll().stream().map(StudentsResponse::new).collect(Collectors.toList());
    }

    /**
     * Metodo que realiza la busqueda de un usuario desde el nombre completo.
     *
     * @param fullName Dato entrante para consultar por nombre al estudiante (FULLNAME).
     * @return {@link StudentsResponse}
     */
    @Override
    public StudentsResponse find(String fullName) {
        StudentsEntity entity = repository.findStudentsByFirstNameOrLastNameIgnoreCase(fullName);
        if (entity == null){
            throw new ResponseExceptionDefault("Nombre de alumno no existe dentro de los registros");
        }
        return StudentsMapper.mapResponse(entity);
    }

    /**
     * Metodo para actualizar los datos del estudiante
     *
     * @param id Dato entrando para buscar al usuario requerido en la actualización.
     * @return {@link StudentsResponse}
     */
    @Override
    public StudentsResponse update(Integer id, StudentsRequest request) {
        StudentsEntity entity = repository.findStudentsEntityById(id);

        if (entity == null) {
            throw new ResponseExceptionDefault("El usuario ingresado no existe en los registros");
        }

        entity.setFirstName(request.getFirstName());
        entity.setLastName(request.getLastName());
        entity.setAge(request.getAge());
        entity.setCredits(request.getCredits());
        entity.setSemester(request.getSemester());
        entity.setAverage(request.getAverage());

        StudentsEntity updatedEntity = repository.save(entity);

        return StudentsMapper.mapResponse(updatedEntity);
    }

}
