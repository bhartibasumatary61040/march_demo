package exception_handeling;

public class Calculator {
    public void divide(int a, int b) {

        int result = 0;
        System.out.println("***Before division");
        try {
            result = a / b;
        } catch (Exception e) {
            System.out.println("exception occured and catch  so value of result is ZERO ");
        }
        finally {
            System.out.println("FINALLY BLOCK EXECUTION");
        }


        System.out.println("***After division");
        System.out.println(" division od a and b is " + result);
         }
            public void printArray(int arr[]){
                System.out.println("*** Before print");
                try {
                    System.out.println("printing 4th element of array " + arr[3]); //0,1,2,3
                }
                catch (Exception e){
                    System.out.println("Exception occured..");
                }
                System.out.println("***After print");

        }
        public static void main (String[]args){
            Calculator obj = new Calculator();
            obj.divide(10, 0);
            int [] arr ={7,5,3}; // 0,1,2
            obj.printArray(arr);
        }


    }


