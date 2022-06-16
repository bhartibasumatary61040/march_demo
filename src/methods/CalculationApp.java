package methods;

public class CalculationApp {

    //SYNTAX: access_specifier return_type methode_name(parameter){code}

    //addition

    public void addition(){
        System.out.println("this is add method of calculation");
         int a= 42;
         int b=15;
         int result=a+b;
        System.out.println("result is  "+ result );
    }
    // subtraction

    public void subtraction(){
        System.out.println("this is subtraction method of calculation");
        int a=105;
        int b=55;
        int result=a-b;
        System.out.println("result is "+ result );
    }
    //divide
    public void divide (){
        System.out.println(" this is divide methode of calculation");
        int a= 255;
        int b= 25;
        int result =a/b;
        System.out.println("result is "+ result );
    }

    // multiplication
    public void multiplication (){
        System.out.println(" this is multiplication methode of calculation");
        int a= 95;
        int b=45;
        int result= a*b;
        System.out.println(" result is "+ result);
    }

    public static void main(String[] args) {
         CalculationApp obj=new CalculationApp();
         obj.addition();
         obj.subtraction();
         obj.divide();
         obj.multiplication();
    }
}
