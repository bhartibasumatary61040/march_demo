package arrays;

public class Demo2Array {

    public static void main(String[] args) {
        // SYNTAX: datatype var_ name[]={ value1, value2...}

        String nane = " lucky ";
        String name1 = " nikki";
        String name2 = " rahul";

        String names[] = {" lucky", " nikki", "rahul", " raj"};
        System.out.println(" printing array " + names[2]);
        System.out.println(" printing array " + names[1]);
        System.out.println(" printing array " + names[3]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(" FOR LOOP"+ names[i]);

        }
         for( String var: names){
             System.out.println(" ADVANCE LOOP "+ var);
         }
          int marks[]={ 23,33,54,67,78,89,90};
        for( int var: marks){
            System.out.println( " printing marks "+var);

        }
         double salary[]={ 23.55,50.00, 55.00, 60.00};
         for( double var: salary){
             System.out.println(" salary is "+ var);
         }
    }
}
