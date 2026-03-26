package Day06.collections.ObjectSerialization;

import Day06.collections.ObjectSerialization.Employee;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayObjectSerialization {
    public static void main(String[] args) throws IOException,ClassNotFoundException {

        ArrayList<Employee> arrayList = new ArrayList<>();

        arrayList.add(new Employee(1,"aarti"));
        arrayList.add(new Employee(2,"bharti"));

        FileOutputStream fos = new FileOutputStream("outfile.ser");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        oos.writeObject(arrayList);

        fos.close();
        oos.close();

        FileInputStream fis = new FileInputStream("outfile.ser");
        ObjectInputStream ois = new ObjectInputStream(fis);

        Object o = ois.readObject();
        ArrayList<Employee> newEmployee = (ArrayList<Employee>) o;
        System.out.println(newEmployee);
    }
}