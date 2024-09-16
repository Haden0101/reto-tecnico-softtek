package com.example.codechallenge.service.impl;

import com.example.codechallenge.service.StudentsService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentsServiceImplTest {

    @Autowired
    StudentsService studentsService;

    @Test
    void save() {
        Assertions.assertTrue(true);
    }

    @Test
    void users() {
        Assertions.assertTrue(true);
    }

    @Test
    void find() {
        Assertions.assertTrue(true);
    }
}