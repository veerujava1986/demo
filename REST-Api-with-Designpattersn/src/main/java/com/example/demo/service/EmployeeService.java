package com.example.demo.service;



import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo employeeRepo;

    public void createEmployee(Employee emp) {

        EmployeeEntity emp1=EmployeeEntity.builder().empId(emp.getEmpId()).build();
        employeeRepo.save(null);

       // employeeRepo.save();
    }
}
