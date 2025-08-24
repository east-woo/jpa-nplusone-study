package com.eastwoo.study.jpanplusonestudy.service;

import com.eastwoo.study.jpanplusonestudy.entity.Department;
import com.eastwoo.study.jpanplusonestudy.entity.Employee;
import com.eastwoo.study.jpanplusonestudy.repository.DepartmentRepository;
import com.eastwoo.study.jpanplusonestudy.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class EmployeeService {

    private final EmployeeRepository employeeRepository;
    private final DepartmentRepository departmentRepository;

    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    public List<Employee> getEmployeesByDepartment(Long departmentId) {
        return employeeRepository.findByDepartmentId(departmentId);
    }

    public Employee addEmployee(String name, Long departmentId) {
        Department dept = departmentRepository.findById(departmentId)
                .orElseThrow(() -> new IllegalArgumentException("Invalid department id"));
        Employee emp = new Employee();
        emp.setName(name);
        emp.setDepartment(dept);
        return employeeRepository.save(emp);
    }

    public Optional<Employee> getEmployee(Long id) {
        return employeeRepository.findById(id);
    }
}