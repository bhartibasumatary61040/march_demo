package loops_demo;

public class DemoLoops {

    public static void main(String[] args) {

        //for(initialization; condition; increment/decrement){}

        for (int i = 0; i < 5; i++) {

            System.out.println("hello from increment loops ;" +i);
        }

        //decrement loops

        for (int i = 5; i > 0; i--) {
            System.out.println("hello from decrement ;" +i);
        }
    }
}