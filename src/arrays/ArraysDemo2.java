package arrays;

public class ArraysDemo2 {

    public static void main(String[] args) {

        //SYNTAX Datatype var_name[]={ value1, value2..};

        String name = "samsung";
        String name1 = "vivo";
        String name2 = "iphone";
        String name3 = "oppo";
        String names[] = {" samsung", " vivo", " iphone", " oppo"};
        System.out.println("printing array" + names[0]);
        System.out.println("printing array" + names[1]);
        System.out.println("printing array" + names[2]);
        System.out.println("printing array" + names[3]);

        for (int i = 0; i < names.length; i++) {
            System.out.println("printing array by using foor loop" + names[i]);

            //advance for loop SYNTAX for(datatype var_name:array/collection){}


            for (String var : names) {
                System.out.println(" printing names by advance loop " + var);
            }

                int prices[] = {2500, 5000, 3000, 4000};
                for (int var : prices) {
                    System.out.println(" printing prices "+ var);

                }
                double salary[]={ 23.55, 25.00,35.00,45.00};
                for( double var:salary){
                    System.out.println("printing salary "+var);
                }
            }
        }
    }

