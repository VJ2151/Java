package Day06.collections.comparator;

import Day06.collections.comparable.Employee;

import java.util.*;
import java.util.Collections;

class TestEmployee {
    public static void main(String[] args) {


        List<Employee> employeeList = new ArrayList<>();

        employeeList.add(new Employee(3, "a"));
        employeeList.add(new Employee(1, "b"));
        employeeList.add(new Employee(2, "C"));

        System.out.println(employeeList);
        System.out.println("AFTER SORTING");

        Collections.sort(employeeList,new TestComparator());
        System.out.println(employeeList);
    }


}
