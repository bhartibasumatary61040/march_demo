package methods;

import java.util.Scanner;

public class DemoScanner {

    public static void main(String[] args) {

        // create object of scanner class
        Scanner obj = new Scanner(System.in);
        // string input

        System.out.println(" please enter your name");
        String name = obj.nextLine(); // used for reads string input

        System.out.println(" please enter your name as " + name);

        //int input

        System.out.println(" please enter your age ");
        int age = obj.nextInt();// used for reads int input

        System.out.println(" please enter your age as "+ age);
        //double input

        System.out.println(" please enter your salary");

        double salary= obj.nextDouble();//used for reads double input

        System.out.println(" please enter your salary as "+ salary);
    }
}
