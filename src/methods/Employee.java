package methods;

public class Employee {

    public void work(){
        System.out.println("this is work methode");
    }
     public void salary(){
         System.out.println("this is salary methode");
     }

    public static void main(String[] args) {
         Employee obj=new Employee();
         obj.work();
         obj.salary();
    }
}
