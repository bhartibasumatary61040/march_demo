package polymorphism;

import javafx.scene.Parent;

public class Child extends RunTimePolymorphism {

    public void m1(){
        System.out.println(" ***** this is m1 from child class");
    }

    public static void main(String[] args) {
        Child obj= new Child();
        obj.m1();
        //runtime polymorphism
    //Q1
        RunTimePolymorphism parent = new RunTimePolymorphism();
        parent.m1();//call parent m1
   //Q2
        RunTimePolymorphism parent1= new Child();
        parent1.m1(); // call child m1

       //Q3 // we can not assign parent object to child reference variable
    }

}
