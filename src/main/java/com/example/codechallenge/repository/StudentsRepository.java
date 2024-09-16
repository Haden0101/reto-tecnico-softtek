package com.example.codechallenge.repository;

import com.example.codechallenge.model.entity.StudentsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface StudentsRepository extends JpaRepository<StudentsEntity, Integer> {

    @Query(value = "SELECT * FROM students_entity WHERE (LOWER(first_name) LIKE LOWER(CONCAT('%', :name, '%')) OR LOWER(last_name) LIKE LOWER(CONCAT('%', :name, '%'))) OR LOWER(CONCAT(first_name, ' ', last_name)) LIKE LOWER(CONCAT('%', :name, '%'))", nativeQuery = true)
    StudentsEntity findStudentsByFirstNameOrLastNameIgnoreCase(@Param("name") String name);

}
