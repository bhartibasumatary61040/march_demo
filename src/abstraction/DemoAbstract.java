package abstraction;

public abstract class DemoAbstract {

    public abstract void m1();//abstract methode

    public void m2() {

        System.out.println("this is normal methode and shear with ALL");
    }

    // we can  not create object of abstract class
    public static void main(String[] args) {
        /*DemoAbstract obj = new DemoAbstract();
        obj.m1();*/

    }

}
