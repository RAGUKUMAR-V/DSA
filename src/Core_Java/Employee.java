package Core_Java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Employee implements Comparator<Employee> {

   int id;
   String name;
   int salary;
   String department;

    Employee() {
        // Needed because Collections.sort(employees, new Employee())
    }

   Employee(int id, String name, int salary, String department){
       this.id=id;
       this.name=name;
       this.salary=salary;
       this.department=department;


   }



//    @Override
//    public int compare(Employee o1, Employee o2) {
//        return Integer.compare(o2.salary , o1.salary);
//    }

    @Override
    public int compare(Employee o1, Employee o2) {
        return o2.name.compareTo( o1.name);
    }

//    @Override
//    public String toString() {
//        return id + " " + name + " " + salary + " " + department;
//    }


    public static void main(String[] args) {

       Employee emp1=new Employee(1,"Ragu1",500000001,"SDET");
        Employee emp2=new Employee(2,"Ragu2",500000002,"DEV");
        Employee emp3=new Employee(3,"Ragu3",500000003,"Devops");
        Employee emp4=new Employee(4,"Ragu4",500000004,"manager");

        List<Employee> employees = new ArrayList<>();

        employees.add(emp1);
        employees.add(emp2);
        employees.add(emp3);
        employees.add(emp4);

        for(Employee emp:employees){
            System.out.println(emp.name.toString());
        }


        Collections.sort(employees, new Employee());

        for(Employee emp:employees){
            System.out.println(emp.name.toString());
        }

        System.out.println("***********************************************");

        employees.sort((e1,e2) ->e2.name.compareTo(e1.name));


        for(Employee emp:employees){
            System.out.println(emp.name.toString());
        }





    }
}
