package collection;

import model.Employee;
import model.Employee2;

import java.util.HashSet;

public class SetDemo2 {

    public void createDemoSet(){

        HashSet<Employee2> employeess= new HashSet<>();

       Employee2 employee1= new Employee2(" raj", 35,"agra") ;
        Employee2 employee2= new Employee2(" raj", 35,"agra") ;
        Employee2 employee3= new Employee2(" rahul", 23,"assam") ;

         employeess.add(employee1);
        employeess.add(employee2);
        employeess.add(employee3);



        for( Employee2 var: employeess){
             System.out.println(" printing employee data " + var.getName()+ ":" + var.getAge()+":"+ var.getAddress());
         }



    }

    public static void main(String[] args) {
        SetDemo2 obj= new SetDemo2();
        obj.createDemoSet();
    }

    }


