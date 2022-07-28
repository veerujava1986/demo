package Comparable;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {
    public static void main(String[] args) {

        Employee e=Employee.builder().id(12).name("veeru").salary(78.1f).build();
        Employee e1=Employee.builder().id(13).name("ravi").salary(10.2f).build();
        Employee e2=Employee.builder().id(14).name("ramu").salary(688.5f).build();
        Employee e3=Employee.builder().id(15).name("sita").salary(7.6f).build();

        ArrayList<Employee> al=new ArrayList<>();
        al.add(e);
        al.add(e1);
        al.add(e2);
        al.add(e3);

        Collections.sort(al);
        System.out.println(al.toString());

    }
}
