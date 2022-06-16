package methods;

public class CalcWithInput {

    //addition
     public void addition ( int a, int b ){

          int result = a+b;
         System.out.println(" addition is "+ result);
     }
     // multiplication

    public void multiplication( int a, int b){
          int result = a*b;
        System.out.println(" multiplication is "+ result);
    }
    // subtraction
    public void subtraction ( int a, int b ){
          int result = a-b;
        System.out.println(" subtraction is "+ result);
    }
    // divide
     public void divide( int a, int b){
          int result= a/b;
         System.out.println(" divide is "+ result );
     }

    public static void main(String[] args) {
        CalcWithInput obj = new CalcWithInput();
        obj.addition(55,38);
        obj.multiplication( 56,23);
        obj.subtraction( 533, 145);
        obj.divide(500,25);
    }
}
