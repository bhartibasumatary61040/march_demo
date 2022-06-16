package abstraction;

public class InterfaceImpl implements DemoInterface {

    @Override
    public void m1() {
        System.out.println("M1");

    }

    @Override
    public void m2() {
        System.out.println("M2");

    }

    @Override
    public void m3() {
        System.out.println("M3");

    }

    public static void main(String[] args) {
        InterfaceImpl obj= new InterfaceImpl();
        obj.m1();
        obj.m2();
        obj.m3();

    }
}
