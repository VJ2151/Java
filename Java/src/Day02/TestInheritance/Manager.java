package Day02.TestInheritance;

public class Manager extends Employee {
    String projects;

    Manager(String name, int id) {
        super(name, id);
    }

    @Override
    public void calculateSalary() {
        this.salary = 5000 * id;
    }

    @Override
    public String toString() {
        return super.toString() + "" + this.salary + "" ;
    }
}
