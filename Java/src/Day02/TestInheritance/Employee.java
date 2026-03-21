package Day02.TestInheritance;

public abstract class Employee {
    String name;
    int id;
    float salary;

    public Employee(String name,int id) {
        this.name = name;
        this.id = id;
    }
        public abstract void calculateSalary();
    @Override
    public String toString(){
        return name+""+id;
    }

    }

