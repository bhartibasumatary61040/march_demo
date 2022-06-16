package class_object;

public class ParameterizedStudent {

    String name;
    int age;
    String address;

    //parameterized construction


    public ParameterizedStudent(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public static void main(String[] args) {

        ParameterizedStudent obj=new ParameterizedStudent("bharti",23, "Agra");

        System.out.println("printing student object "+ obj.name+ ":"+ obj.age+ ":"+ obj.address);
    }
}
