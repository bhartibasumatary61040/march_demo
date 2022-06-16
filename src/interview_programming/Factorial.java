package interview_programming;

public class Factorial {
    public static  void getNumber(int a){
        int factorial=1;
        for(int i=1; i<=a;i++){
            factorial=factorial*i;
        }
        System.out.println(factorial);
    }

    public static void main(String[] args) {
        getNumber(5);
    }
}
