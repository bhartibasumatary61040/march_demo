package arrays;

public class Demo {
    public static void main(String[] args) {

        //SYNTAX : datatype var_name[]={ value1, value2...}

        String name = " JAVA";
        String name1 = "cloud";
        String name2 = " spring";

        String names[] = {" java", " cloud", " spring", " spring boot"};

        System.out.println(" printing array " + names[2]);
        System.out.println(" printing array " + names[0]);
        System.out.println(" printing array " + names[1]);

        for (int i = 0; i < names.length; i++) {
            System.out.println(" FOR LOOP " + names[i]);
        }

        //advance for loop

        for( String var: names){
            System.out.println( " ADVANCE LOOP "+var);
        }
    }
}
