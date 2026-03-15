package com.example.demo.controller;

import java.util.List;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exceptions.EmployeeNotFound;
import com.example.demo.model.Employee;
import com.example.demo.service.EmployeeService;

import lombok.AllArgsConstructor;

@RestController//@Controller+@ResponseBody
@RequestMapping("/employees")
@AllArgsConstructor
public class EmployeeController {

    EmployeeService service;

    @GetMapping("/message")
    public String getMessage() {
        return "Employee details added successfully";
    }

    @PostMapping("/save")
    public String createEmployee(@RequestBody @Validated Employee employee) {
        return service.saveEmployee(employee);
    }

    @PutMapping("/update")
    public String updateEmployee(@RequestBody Employee employee) {
        return service.updateEmployee(employee);
    }

    @DeleteMapping("/delete/{id}")
    public String removeEmployee(@PathVariable("id") int empId) {
        return service.deleteEmployee(empId);
    }

    // Fetch by ID
    @GetMapping("/fetch/{id}")
    public Employee getEmployee(@PathVariable("id") int empId) throws EmployeeNotFound {
        return service.getEmployee(empId);
    }

    // Fetch all
    @GetMapping("/fetchAll")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    // Fetch by designation: /employee/fetchByDesg?empDesg=Developer
    @GetMapping("/fetchByDesg")
    public List<Employee> getEmployeesByDesg(@RequestParam("empDesg") String empDesg) {
        return service.getEmployeeByDesg(empDesg);
    }

    // Fetch by salary range: /employee/fetchBySalary?Sal1=30000&Sal2=60000
    @GetMapping("/fetchBySalary")
    public List<Employee> getEmployeesBySalaryRange(
            @RequestParam("Sal1") int initialSal,
            @RequestParam("Sal2") int finalSal) {
        return service.getEmployeesBetweenSal(initialSal, finalSal);
    }
}