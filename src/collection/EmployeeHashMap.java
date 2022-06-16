package collection;

import model.Employee;

import java.util.HashMap;

public class EmployeeHashMap {

    public void createHashMap(){

        //SYNTAX: HashMap< key datatype,value datatype> objName= new HashMap<>():

        HashMap<Integer, Employee> employeeHashMap= new HashMap<>();

        Employee employee= new Employee("raj", 1, "PSA");
        Employee employee2= new Employee("rahul", 2, "BDA");
        Employee employee3= new Employee("rakesh", 3, "BTA");
        Employee employee4= new Employee("rajiv", 4, "PSM");

        employeeHashMap.put(1, employee);
        employeeHashMap.put(2, employee2);
        employeeHashMap.put(3, employee3);
        employeeHashMap.put(4, employee4);

        System.out.println(employeeHashMap.get(1).getName());
        System.out.println(employeeHashMap.get(1).getId());
        System.out.println(employeeHashMap.get(1).getDept());

        for(Integer var: employeeHashMap.keySet()){
            System.out.println(" printing using advance loop "+ employeeHashMap.get(var).getName()+":"
            +employeeHashMap.get(var).getId()+":"+ employeeHashMap.get(var).getDept());
        }


    }

    public static void main(String[] args) {
         EmployeeHashMap obj= new EmployeeHashMap();
          obj.createHashMap();
    }
}
