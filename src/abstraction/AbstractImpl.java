package abstraction;

public class AbstractImpl extends DemoAbstract {

    @Override
    public void m1() {
        System.out.println(" this is overidden methode");
    }

    public static void main(String[] args) {
        AbstractImpl obj= new AbstractImpl();
        obj.m1();
        obj.m2();
    }
}
