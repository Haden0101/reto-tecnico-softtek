package com.example.codechallenge.controller;

import com.example.codechallenge.model.api.StudentsRequest;
import com.example.codechallenge.model.api.StudentsResponse;
import com.example.codechallenge.service.StudentsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;

import java.util.List;

@RestController
@RequestMapping(path = "${application.api.path}")
public class StudentsController {

    @Autowired
    private StudentsService service;

    @PostMapping("/create")
    public void save(@RequestBody StudentsRequest request) {
        service.save(request);
    }

    @GetMapping("/get-user")
    public List<StudentsResponse> users() {
        return service.users();
    }

    @GetMapping(path = "/findUserByNameOrFullName")
    public StudentsResponse find(
            @RequestParam("name") String fullName) {
        return service.find(fullName);
    }

}
