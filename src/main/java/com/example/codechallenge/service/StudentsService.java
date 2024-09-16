package com.example.codechallenge.service;

import com.example.codechallenge.model.api.StudentsRequest;
import com.example.codechallenge.model.api.StudentsResponse;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;

import java.util.List;

@Service
public interface StudentsService {

    void save(StudentsRequest request);
    List<StudentsResponse> users();
    StudentsResponse find(String fullName);
    StudentsResponse update(Integer id, StudentsRequest request);
    void delete(Integer id);

}
