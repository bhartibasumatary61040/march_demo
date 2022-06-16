package class_object;

public class Student {
    String name;
    int age;
    String address;

    public static void main(String[] args) {
        // ClassName objName=new ClassName

        Student obj1= new Student();
        Student obj2=new Student();
        Student obj3=new Student();
        obj1.name="Jojo";
        obj2.age=23;
        obj3.address="agra";

        System.out.println("Printing student object ="+ obj1.name +":" +obj2.age + ":" + obj3.address );


    }
}
