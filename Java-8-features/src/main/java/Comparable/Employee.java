package Comparable;

import lombok.*;

@Data
@Builder
public class Employee implements Comparable<Employee>{
    private int id;
    private String name;
    private float salary;


    @Override
    public int compareTo(Employee c) {
         ;

        if(c.salary>this.getSalary()){
            return 1;
        }else if(c.salary<this.getSalary()){
            return -1;
        }else {
            return 0;
        }
    }
}
