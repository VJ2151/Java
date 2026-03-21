package Day02.AccessSpecifier3;

import Day02.AccessSpecifier1.Employee;

public class TestEmployee {
    public static void main(String[] args) {
        Employee employee=new Employee("Ashish",2000);
        Employee employee1=new Employee("Ashish",4000);

        employee.setDepartment("IT");
        employee.setIncentive(500f);

        System.out.println(employee);
        System.out.println(employee1);
}



