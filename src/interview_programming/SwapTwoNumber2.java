package interview_programming;

public class SwapTwoNumber2 {
    public static void getNumbers(int a, int b){
        a= a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping a="+a+" and b="  +b);

    }
    public static void main(String[] args) {
        getNumbers(25,35);

    }
}
