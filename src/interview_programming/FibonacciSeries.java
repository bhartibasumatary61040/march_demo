package interview_programming;

public class FibonacciSeries {

    public static void getFibonacciNum(int num){
        int a = 0, b = 1, c;
        System.out.println(a+"\n"+b);
        for (int i = 0; i<=num; i++){
            c = a+b;
            a = b;
            b = c;
            System.out.println(c);
        }
    }

    public static void main(String[] args) {
        getFibonacciNum(10);
    }
}
