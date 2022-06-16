package scanner;

import java.util.Scanner;

public class CalculationWithScanner {

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
        Scanner scanner = new Scanner(System.in);
        CalculationWithScanner obj = new CalculationWithScanner();


        int flag = 1;

        while (flag == 1) {
            System.out.println(" WELCOME TO CALCULATOR APP please entered your choice");
            int choice = scanner.nextInt();

            System.out.println(" 1 for addition, 2 for subtraction, 3 for multiplication, 4 for divide");

            System.out.println("please entered value of a");
            int a = scanner.nextInt();

            System.out.println(" please enter value of b ");
            int b = scanner.nextInt();
            int result;

            if (choice == 1) {
                result = obj.addition(a, b);
                System.out.println("ADDITION od a and b is " + result);
            } else if (choice == 2) {
                result = obj.subtraction(a, b);
                System.out.println(" SUBTRACTION of a and b is " + result);
            } else if (choice == 3) {
                result = obj.multiplication(a, b);
                System.out.println("MULTIPLICATION of a and b is " + result);
            } else {
                result = obj.divide(a, b);
                System.out.println("DIVIDE of a and b is " + result);
            }

            Scanner scanner1 = new Scanner(System.in);
            System.out.println("DO YOU WANT TO : press Y to exit N to continue ");
            String input = scanner1.nextLine();
            if (input.equals("Y")) {
                flag = 0;
            }
        }
    }
}
