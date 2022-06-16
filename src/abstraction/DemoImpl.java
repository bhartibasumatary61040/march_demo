package abstraction;

public class DemoImpl  extends Demo{
    @Override
    public void m1() {
        System.out.println("Hello from impl");
    }

    public static void main(String[] args) {
        DemoImpl obj= new DemoImpl();
        obj.m1();
    }
}
