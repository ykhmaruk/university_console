package com.example.university_console.repository;

import com.example.university_console.entity.Lector;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LectorRepository extends JpaRepository<Lector, Long> {
    List<Lector> findAllByFullNameContainingIgnoreCase(String template);
}
