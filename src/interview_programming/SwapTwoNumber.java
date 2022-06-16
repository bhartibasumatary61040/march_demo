package interview_programming;

import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value of X AND Y");
        Scanner scanner= new Scanner(System.in);
        int X= scanner.nextInt();
        int Y= scanner.nextInt();
        System.out.println("Before Swapping number :"+X+ ":"+Y);
        X=X+Y;
        Y=X-Y;
        X=X-Y;
        System.out.println("After swapping:"+ X +":" + Y);
    }
}
