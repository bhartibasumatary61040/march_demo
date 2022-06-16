package class_object;

public class Employee {

    String name;
    int salary;
    String department;

    //parameterized construction


    public Employee(String name, int salary, String department) {
        this.name = name;
        this.salary = salary;
        this.department = department;
    }

    public static void main(String[] args) {
        // SYNTAX: ClassName objName =new ClassName();

         Employee obj=new Employee("rahul",27500,"PSA");
        System.out.println("printing employee object " + obj.name+ ":"+obj.salary+ ":" + obj.department);
    }
}
