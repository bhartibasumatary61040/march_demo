package methods;

public class Student {
    //SYNTAX; access_specifier return_type methodeName(parameter){code}

    public void read(){
        System.out.println(" this is read method");
    }

    public void write(){
        System.out.println(" this is write methode");
    }

    public static void main(String[] args) {

        Student obj=new Student();
        obj.read();
        obj.write();
    }
}
