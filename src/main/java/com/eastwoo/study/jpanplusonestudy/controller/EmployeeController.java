package com.eastwoo.study.jpanplusonestudy.controller;

import com.eastwoo.study.jpanplusonestudy.entity.Employee;
import com.eastwoo.study.jpanplusonestudy.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/department/{departmentId}")
    public List<Employee> getEmployeesByDepartment(@PathVariable Long departmentId) {
        return employeeService.getEmployeesByDepartment(departmentId);
    }

    @PostMapping
    public Employee addEmployee(@RequestParam String name,
                                @RequestParam Long departmentId) {
        return employeeService.addEmployee(name, departmentId);
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable Long id) {
        return employeeService.getEmployee(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found"));
    }
}