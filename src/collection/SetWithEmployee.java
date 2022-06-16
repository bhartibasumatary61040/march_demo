package collection;

import class_object.Employee;

import java.util.HashSet;

public class SetWithEmployee {


    public void CreateWithSet() {

        //SYNTAX : collectionName<datatype> obj= new collectionName<>();

        HashSet<Employee> employees = new HashSet<>();

        Employee employee1 = new Employee(" ram",1 , " PSA");
        Employee employee2 = new Employee(" ajay",2 , " BDA");
        Employee employee3 = new Employee(" ajay", 3, " BDA");
        Employee employee4 = new Employee(" lucky",4, "BDT");

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);

        for( Employee var: employees){
            System.out.println(" printing SET  "+ var);
        }


    }
    public static void main(String[] args) {
        SetWithEmployee obj = new SetWithEmployee();
         obj.CreateWithSet();
    }
}

