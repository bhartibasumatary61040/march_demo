package methods;

import java.util.Scanner;

public class CalculatorWithScanner {

    public int addition(int a, int b) {
        int result = a + b;
        return result;
    }

    public int subtraction(int a, int b) {
        int result = a - b;
        return result;

    }

    public int multiplication(int a, int b) {
        int result = a * b;
        return result;
    }

    public int divide(int a, int b) {
        int result = a / b;
        return result;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to calculator app" + "please enter your choice");
        System.out.println("1 for addition, 2 for subtraction, 3 for multiplication 4 for divide ");
        Scanner Scanner = new Scanner(System.in);
        int choice = Scanner.nextInt();
        CalculatorWithScanner obj = new CalculatorWithScanner();
        System.out.println("Please enter value of a");
        int a = Scanner.nextInt();
        System.out.println("Please enter value of b");
        int b = Scanner.nextInt();
        int result;


        if (choice == 1) {
            result = obj.addition(a, b);
            System.out.println("Addition of a and b  " + result);
        } else if (choice == 2) {
            result = obj.subtraction(a, b);
            System.out.println(" subtraction of a and b ia " + result);
        } else if (choice == 3) {
            result = obj.multiplication(a, b);
            System.out.println(" multiplication of a and b is " + result);
        } else if (choice == 4) {
            result = obj.divide(a, b);
            System.out.println("divide of a and b is " + result);
        }


        }
    }








