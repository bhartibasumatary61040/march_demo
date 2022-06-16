package methods;

public class MethodInputParam {

    public void message(String name){
        System.out.println("this is hello method  " + name);

    }
     public void age( int age ){
         System.out.println("your age is  "+ age);
     }
      public void salary( double salary){
          System.out.println(" enter your salary  "+ salary);
      }
       public void hello(String name , int salary ){
           System.out.println("you have enter your name  "+ name +  " and salary " +salary);
       }

    public static void main(String[] args) {
        MethodInputParam obj = new MethodInputParam();

        obj.message("bharti");
        obj.age(23);
        obj.salary(27544.56);
        obj.hello("bharti", 27544);
    }
}
