package com.example.university_console.service;

import com.example.university_console.entity.Department;
import com.example.university_console.entity.Lector;
import java.util.List;

public interface DepartmentService {
    Department findByName(String departmentName);
    String findHeadOfDepartment(String departmentName);
    String getStatisticOfDepartment(String departmentName);
    double getAveregeSalaryOfDepartment(String departmentName);
    Long getNumberOfLectorsInDepartment(String departmentName);
    List<String> getNamesByTemplate(String template);
    Department setHeadOfDepartment(Department department, Lector lector);
}
