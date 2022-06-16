package collection;

import model.Student;

import java.util.ArrayList;

public class StudentList {

     public void createStudentList(){
          //SYNTAX  collection name <datatype> obj= new collectionName<>();
          ArrayList<Student> studentArrayList=new ArrayList<>();

          // create object for student

          Student student= new Student(" raj", 29," CS ");
          Student student1= new Student(" meena ", 34 ," IT");
          Student student2= new Student(" seela ", 55 ," AB");
          //add object to student arraylist

          studentArrayList.add(student);
          studentArrayList.add(student1);
          studentArrayList.add(student2);
          // get student information

          studentArrayList.get(1);
          System.out.println(" printing student data "+ student.getName());

           for ( Student  var : studentArrayList){
                System.out.println(" printing student  data USING ADVANCE LOOP "+ var.getName()+":" +var.getRollno()+":" + var.getSection());
           }

     }

     public static void main(String[] args) {
          StudentList obj = new StudentList();
           obj.createStudentList();
     }
}
