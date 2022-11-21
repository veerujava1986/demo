package com.example.demo.endpoint;


import com.example.demo.model.Employee;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeRestController {

    @PostMapping("api/employees")
    public void createEmployee(@RequestBody Employee emp){
    }

    @DeleteMapping("api/employees/{id}")
    public void deleteEmployee(@PathVariable("id") int id){

    }

    @GetMapping("api/employees")
    public List<Employee> getEmployees(){

        return null;
    }

    @GetMapping("api/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") int id){

        return null;
    }

    @PutMapping("api/employees/{id}")
    public void updateEmployeeById(@PathVariable("id") int id){

    }

    @GetMapping("api/employees/{name}")
    public Employee searchByName(@PathVariable("name") String name){
            return null;
        }


    }





