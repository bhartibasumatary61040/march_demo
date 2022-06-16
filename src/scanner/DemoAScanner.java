package scanner;

import java.util.Scanner;

public class DemoAScanner {

    public static void main(String[] args) {

        Scanner obj= new Scanner(System.in);
        System.out.println(" please enter student name");
         String name= obj.nextLine();
        System.out.println(" you have entered student name as "+ name);

        System.out.println(" please entered student rollNumber ");
        int rollNo= obj.nextInt();
        System.out.println(" you have entered student rollNumber as "+rollNo);

        System.out.println(" please entered your salary");
         double salary= obj.nextDouble();
        System.out.println(" you have entered your salary as "+ salary);

    }
}
