package methods;

public class CalculatorReturnType {

    public int addition( int a, int b){
        int result= a+b;
        return result;

    }
     public int multiplication (int a, int b){
        int result= a*b;
        return result;
    }
    public int divide( int a, int b){
        int result= a/b;
         return result;
    }
     public int subtraction (int a, int b){
        int result= a-b;
         return result;
     }

    public static void main(String[] args) {
        CalculatorReturnType obj= new CalculatorReturnType();
         int result= obj.addition(35,56);
        System.out.println("addition is "+result);

         int result1=obj.multiplication(26,12);
        System.out.println("multiplication is "+ result1);

          int result2=obj.divide(355, 25);
        System.out.println(" divide is "+ result2);

         int result3= obj.subtraction(268, 142);
        System.out.println(" subtraction is "+ result3);

    }

}
