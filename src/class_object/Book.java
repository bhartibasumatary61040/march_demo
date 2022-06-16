package class_object;

public class Book {
     String name;
     int pages;
     String writer;

    public static void main(String[] args) {

        Book obj1=new Book();
        Book obj2=new Book();
        Book obj3= new Book();
        obj1.name="java";
        obj2.pages=21;
        obj3.writer="Harry";
        System.out.println("Printing book onject ="+obj1.name+ ":"+ obj2.pages+":"+ obj3.writer);


    }
}
