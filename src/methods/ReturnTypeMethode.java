package methods;

public class ReturnTypeMethode {

    //access specifier return_type(data name) methode_name (parameter) {code}

    public String message(String name){
        String message= name;
        return message;
    }
     public String CityName(String Cityname ){
        String result  = Cityname;
        return result;

     }
    public int checkAge  (){
        int age =23;
        return age;
    }
     public int CheckMarks(){
        int Marks= 99;
        return Marks;
     }
    public double getsalary(){
        double salary = 27500;
        return salary;

    }

    public static void main(String[] args) {
        ReturnTypeMethode obj=  new ReturnTypeMethode();
        String output =obj.message("bharti");
        System.out.println("output is "+ output);

        String result =obj.CityName("Agra");
        System.out.println(" city name is "+ result);

        int age =obj.checkAge();
        System.out.println("age is "+ age);

        int Marks=obj.CheckMarks();
        System.out.println("Marks is "+ Marks);

        double salary=obj.getsalary();
        System.out.println("salary is "+salary);
    }
}
