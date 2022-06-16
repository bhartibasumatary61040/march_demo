package methods;

public class Demo {

    /*TODO  Syntax : access_specifier return_type  method_name (parameter) {CODE}
       //access_specifier -> public , private , protected, default   THEORY PART
        //return_type   -> output of function or method :  void : no return type
        //method_name -> can be anything: it should be meaningful
        // parameter ->  input parameter : optional */

    public void hello (){

        System.out.println("this is hello method");
    }
     public void welcome(){
         System.out.println(" welcome to java");
     }

    public static void main(String[] args) {

        Demo obj=new Demo();
        //calling method SYNTAX: objName.methodName();


        obj.hello();
        obj.welcome();
    }
}
