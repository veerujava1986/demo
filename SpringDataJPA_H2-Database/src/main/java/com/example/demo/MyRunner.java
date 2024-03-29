package com.example.demo;

import com.example.demo.entity.Address;
import com.example.demo.entity.Employee;
import com.example.demo.repo.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {


    @Autowired
    EmployeeRepo employeeRepo;

    @Override
    public void run(String... args) throws Exception {


        Employee e = Employee.builder().name("veeru").id(78).salary(300).build();
        Address address=Address.builder().addressLine1("nellore").city("nellore").country("india").pincode(524001).state("AP").build();
        e.setAddress(address);
        employeeRepo.save(e);
        Optional<Employee> emp = employeeRepo.findById(78);
        if(emp.isPresent()){
            System.out.println(emp.get().getName());
        }else {
            System.out.println("not present");
        }

        Employee e2=Employee.builder().id(78).build();
        employeeRepo.delete(e2);





    }
}
