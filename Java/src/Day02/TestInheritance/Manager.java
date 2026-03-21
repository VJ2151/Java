package Day02.TestInheritance;

public class Manager extends Employee {
    Strings projects;
    Manager(String name,int id) {
        this.name = name;
        this.id = id;
}

@Override
public void calculateSalary(){
    this.salary=5000*id;
}

@Override
public String toString(){
    return super.toString()+""+this.salary+""+this.incentives;
}
