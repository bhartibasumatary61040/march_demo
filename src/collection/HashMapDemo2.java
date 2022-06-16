package collection;

import model.Employee2;
import model.Student;

import java.util.HashMap;

public class HashMapDemo2 {

    public void createHashmap(){

        // SYNTAX: HashMap<key datatype, value datatype> objName =  new HashMap<>();

        HashMap<Integer, Employee2> employee2HashMap= new HashMap<>();

        Employee2 employee1= new Employee2("raj", 1,"Agra");
        Employee2 employee2= new Employee2("rahul", 2,"pune");
        Employee2 employee3= new Employee2("rajesh", 3,"Delhi");

        employee2HashMap.put(1, employee1);
        employee2HashMap.put(2, employee2);
        employee2HashMap.put(3, employee3);

        System.out.println(employee2HashMap.get(1).getName());
        System.out.println(employee2HashMap.get(1).getAge());
        System.out.println(employee2HashMap.get(1).getAddress());

        for( Integer var: employee2HashMap.keySet()){

            System.out.println("using advance loop "+employee2HashMap.get(var).getName()+":"
            +employee2HashMap.get(var).getAge()+":"+ employee2HashMap.get(var).getAddress());
        }



    }

    public static void main(String[] args) {
        HashMapDemo2 obj= new HashMapDemo2();
        obj.createHashmap();
    }
}
