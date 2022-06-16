package important_concepts;

public class DemoStatic {
    static int age=23;

    public static void hello(){
        System.out.println(" this is static hello methode");
    }

    public static void main(String[] args) {
        //SYNTAX: CLASSNAME.METHODE NAME();
        DemoStatic.hello();
        System.out.println(DemoStatic.age);
        }
    }

