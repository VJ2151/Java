package Day06.collections.ObjectSerialization;

import java.io.Serializable;

public class Employee implements Serializable {
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name+" "+ this.id;
    }
}
