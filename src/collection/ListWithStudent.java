package collection;

import model.Student;

import java.util.ArrayList;

public class ListWithStudent {

public void createStudentList(){
    //SYNTAX  collection name <datatype> obj= new collectionName<>();

    ArrayList<Student> studentArrayList=new ArrayList<>();
    // create object for student

     Student student = new Student("ram", 1,"CS");
    Student student1 = new Student("raj", 2, "IT");
    Student student2= new Student("rahul", 3, "EC");
    Student student3= new Student("arun", 4, "EE");

    // add object to studentArrayList

    studentArrayList.add(student);//0
    studentArrayList.add(student1); //1
    studentArrayList.add(student2); //3
    studentArrayList.add(student3); //3

    // get student information

      studentArrayList.get(1);
    System.out.println("printing student  Name  "+student.getName());
    System.out.println("printing student  Rollno  "+student.getRollno());
    System.out.println("printing student Section  "+student.getSection());

    // setter method
     student.setName(" Cloud");
    System.out.println(" printing student information name after using setter method "+student.getName());

     for(  int i=0; i< studentArrayList.size(); i++){
         System.out.println(" printing student data in loop NAME   "+ studentArrayList.get(i).getName());
         System.out.println(" printing student data in loop  ROLLNO  "+ studentArrayList.get(i).getRollno());
         System.out.println(" printing student data in loop  SECTION  "+ studentArrayList.get(i).getSection());

     }
      for ( Student var : studentArrayList){
          System.out.println(" printing inside ADVANCE LOOP "+ var.getName()+":" +var.getRollno()+":" +var.getSection());

      }


}

    public static void main(String[] args) {
        ListWithStudent obj =new ListWithStudent();
        obj.createStudentList();
    }
    }
