package polymorphism;

public class compileTimePolumorphism {

    //METHODE OVERLOADING :we will overload same methode with different input parameter

     public void m1(){
         System.out.println("this is m1 methode");
     }
     //overload m1

    public void m1(int a){
        System.out.println("this is overload m1 methode with single parameter");
     }
    //overload with two parameters

    public void m1(int a, String s){
        System.out.println("this is overload m1 methode with TWO parameter");
    }

    public static void main(String[] args) {
        compileTimePolumorphism obj= new compileTimePolumorphism();
        obj.m1();
        obj.m1(3);
        obj.m1(3,"java");

    }

}
