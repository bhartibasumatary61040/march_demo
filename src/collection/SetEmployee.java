package collection;

import model.Employee;

import java.util.HashSet;

public class SetEmployee {

    public void createSet(){

        // SYNTAX: collection <datatype> obj= new collection<>():

        HashSet<Employee> employees= new HashSet<>();
         Employee employee = new Employee( " raj ", 1, " PSA");
        Employee employee2 = new Employee( " raj ", 1, " PSA");
        Employee employee3 = new Employee( " ajay ", 5, " BDA");
        Employee employee4 = new Employee( " rahul ", 2, " AB");
        Employee employee5 = new Employee( " ajay ", 5, " BDA");


        employees.add(employee);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);


        for( Employee var: employees){
             System.out.println(" printing Set "+ var.getName()+": "+ var.getId()+":"+ var.getDept());
         }



    }

    public static void main(String[] args) {
        SetEmployee obj= new SetEmployee();
        obj.createSet();
    }
}
