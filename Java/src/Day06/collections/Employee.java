package Day06.collections;

import Day05.CustomException.Emp;

public class Employee{

    public int id;
    String name;

    public Employee(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int hashCode(){
        System.out.println("Called HashCode");
        return id;
    }

    @Override
    public boolean equals(Object obj1){
        System.out.println("called Equals.");
        if(obj1 != null && obj1 instanceof Employee){
            Employee e = (Employee) obj1;
            if(this.id == e.id ){   //&& this.name = e.name
                return true;
            }
        }
            return false;
    }

    @Override
    public String toString() {
        return "ID : "+this.id +" "+"NAME : "+ this.name;

    }
}
