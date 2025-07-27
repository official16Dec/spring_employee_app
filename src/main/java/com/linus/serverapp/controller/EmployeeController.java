package com.linus.serverapp.controller;

import com.linus.serverapp.dao.EmployeeDao;
import com.linus.serverapp.model.Employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeDao employeeDao;

    @PostMapping("/employee/add")
    public String add(@RequestBody Employee employee) {
        employeeDao.save(employee);
        return "New employee is added";
    }

    @PostMapping("/employee/update")
    public String update(@RequestBody Employee employee) {
        employeeDao.save(employee);
        return "Employee information is updated";
    }

    @PostMapping("/employee/delete")
    public String delete(@RequestBody Employee employee) {
        employeeDao.deleteEmployee(employee);
        return "Employee information is deleted";
    }

    @PostMapping("/employee/get")
    public Employee get(@RequestBody Employee employee) {
        return employeeDao.getEmployeeById(employee.getId());
    }

    @PostMapping("/employee/getAll")
    public Iterable<Employee> getAll() {
        return employeeDao.getAllEmployees();
    }
}
