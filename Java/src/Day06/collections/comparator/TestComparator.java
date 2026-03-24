package Day06.collections.comparator;

import Day06.collections.comparable.Employee;
import java.util.Comparator;

public class TestComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return Integer.compare(e1.getId(), e2.getId());
    }
}
