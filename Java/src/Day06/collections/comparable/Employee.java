package Day06.collections.comparable;

public class Employee implements Comparable<Employee>{
    int id;
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

    public int getId(){
        return this.id;
    }

    @Override
    public boolean equals(Object obj1){
        System.out.println("called Equals.");
        if(obj1 != null && obj1 instanceof Day06.collections.Employee){
            Day06.collections.Employee e = (Day06.collections.Employee) obj1;
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

    @Override
    public int compareTo(Employee o) {
        return Integer.compare(this.id, o.id);
    }
}
