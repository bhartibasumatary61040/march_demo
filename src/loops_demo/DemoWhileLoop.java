package loops_demo;

public class DemoWhileLoop {

    public static void main(String[] args) {
        //SYNTAX= while(condition){code}
        int i = 0;
        while (i < 5) {
            System.out.println(" while loop is " + i);
            i++;
        }
        i = 10;
        while (i > 0) {
            System.out.println(" decrement loop is " + i);
            i--;
        }
        //do while= do(code) while(condition);

        int j = 0;
        do{
            System.out.println(" increment do while loop is "+j);
            j++;
        }

     while(j<10);
     j=10;
     do{
         System.out.println("decrement do while loop is "+j);
         j--;
     }
     while(j>0);

     }
    }


