package collection;

import model.Student;

import java.util.HashMap;

public class StudentHashMap {

     public void createHashMap(){

         // SYNTAX: HashMap<Integer datatype ,value datatype> objName= new HashMap<>():
         HashMap<Integer, Student> studentHashMap= new HashMap<>();

         Student student1= new Student(" raj", 24,"CS");
         Student student2= new Student(" rahul", 14,"IT");
         Student student3= new Student(" rajesh", 34,"EC");
         Student student4= new Student(" raman", 44,"EE");

          studentHashMap.put(1, student1);
         studentHashMap.put(2, student2);
         studentHashMap.put(3, student3);
         studentHashMap.put(4, student4);

         System.out.println(studentHashMap.get(1).getName());
         System.out.println(studentHashMap.get(1).getRollno());
         System.out.println(studentHashMap.get(1).getSection());

         for( Integer var : studentHashMap.keySet()){
             System.out.println(" printing using advance loop "+ studentHashMap.get(var).getName()+ ":"
             + studentHashMap.get(var).getRollno()+":"+ studentHashMap.get(var).getSection());
         }

     }

    public static void main(String[] args) {
         StudentHashMap obj= new StudentHashMap();
         obj.createHashMap();
    }
}
