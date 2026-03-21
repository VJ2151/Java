package Day02.TestInheritance;

import Day02.TestInheritance.Employee;
import Day02.TestInheritance.Test_Employee;

public class Engineer extends Employee {
    int incentives;

    Engineer(String name, int id, int incentives) {
        super(name, id);
        this.incentives = incentives;

    }

    @Override
    public void calculateSalary() {
        this.salary = 1000 * id + incentives;
    }

    @Override
    public String toString() {
        return super.toString() + "" + this.salary + "" + this.incentives;
    }
}
