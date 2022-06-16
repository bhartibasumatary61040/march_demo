package methods;

import java.util.Scanner;

public class ScannerDemo2 {

    public static void main(String[] args) {
        // create object of scanner class

        Scanner obj=new Scanner(System.in);
        //string input

        System.out.println(" please enter city name");
        String name= obj.nextLine();
        System.out.println(" please enter city name as  "+ name);

        //int input

        System.out.println(" please enter  your marks ");
        int  marks = obj.nextInt();
        System.out.println(" please enter your marks as "+ marks);

        // int double
        System.out.println(" please enter your salary");
        double salary= obj.nextDouble();
        System.out.println(" please enter your salary as"+ salary);


    }
}
