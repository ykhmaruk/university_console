package com.example.university_console.repository;

import com.example.university_console.entity.Department;
import java.util.List;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
    Optional<Department> findByName(String name);
    List<Department> findAllByNameContainingIgnoreCase(String template);
}
