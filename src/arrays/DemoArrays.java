package arrays;

public class DemoArrays {
    public static void main(String[] args) {

        //syntax datatype var_name[]={ value1, value2...}

        String name = "java";
        String name1 = "cloud";
        String name2 = "spring ";
        String name3 = "micro";
        String names[] = {" java", " cloud", "spring", "micro"};
        System.out.println(" printing array  " + names[0]);
        System.out.println(" printing array  " + names[1]);
        System.out.println(" printing array  " + names[2]);
        System.out.println(" printing array  " + names[3]);

        for (int i = 0; i < names.length; i++) {
            System.out.println("for loops " + names[i]);


            //advance for loop SYNTAX for (datatype var_name:array/collection){}
            for (String var : names) {
                System.out.println("printing advance for loop " + var);
            }

            int marks[] = {25, 30, 45, 68, 90, 55};
            for (int var : marks) {
                System.out.println("printing marks array " + var);
            }
            double salary[]= {35.55,45.00,67.00,55.00};
            for( double var: salary){
                System.out.println(" printing salary "+ var);
            }

        }
    }
}
