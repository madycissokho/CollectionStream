import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmpDemo {
    public static void main(String[] args) {
        EmpDemo empDemo = new EmpDemo();
        ArrayList<Employee> emp = new ArrayList<>();
        emp.add(new Employee(101, "David", 15000.00));
        emp.add(new Employee(105, "Putin", 25000.00));
        emp.add(new Employee(103, "Cathy", 45000.00));
        emp.add(new Employee(104, "Anny", 35000.00));
        emp.stream().filter((d)->d.getSalary()> 25000).forEach((x)-> System.out.println(x));

        //Custom Sorting for id
        //Collections.sort(emp, new EmpIdComparator());
        //Custom Sorting for name
       // Collections.sort(emp, new EmpNameComparator());
        //Sorting using anonymous implementation
//        Collections.sort(emp, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                return e1.name.compareTo(e2.name);
//            }
//        });
        //Ascending order
//        Collections.sort(emp, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee m1, Employee m2) {
//                if (m1.id > m2.id){
//                    return 1;
//                } else if (m1.id < m2.id) {
//                    return -1;
//                }else {
//                    return 0;
//                }
//            }
//        });
        //Descending order
//        Collections.sort(emp, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                if (e1.id > e2.id){
//                    return -1;
//                } else if (e1.id < e2.id) {
//                    return 1;
//                }else {
//                    return 0;
//                }
//            }
//        });
        //Ascending Order for Salary
//        Collections.sort(emp, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee e1, Employee e2) {
//                if (e1.salary > e2.salary){
//                    return 1;
//                } else if (e1.salary < e2.salary) {
//                    return -1;
//                } else {
//                    return 0;
//                }
//            }
//        });
        //Descending Order for Salary
//        Collections.sort(emp, new Comparator<Employee>() {
//            @Override
//            public int compare(Employee s1, Employee s2) {
//                if (s1.salary > s2.salary){
//                    return -1;
//                } else if (s1.salary < s2.salary) {
//                    return 1;
//                } else {
//                    return 0;
//                }
//            }
//        });
//        for (Employee s : emp){
//            System.out.println(s);
//        }
    }
}
