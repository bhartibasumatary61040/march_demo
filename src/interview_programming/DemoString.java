package interview_programming;

public class DemoString {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = new String("HELLO");

        System.out.println(s1 == s2);//true--object reference check hashcode
        System.out.println(s2 == s3);//false -- object reference hashcode

        System.out.println(s1.equals(s2));//true-- value--->>
        System.out.println(s1.equals(s3));//true-- value --->>

        try {
            throw new RuntimeException();
        } catch (RuntimeException e) {
            throw new Exception(e);
        } catch (Exception r) {
            System.out.println("hello");
        }
    }
}
