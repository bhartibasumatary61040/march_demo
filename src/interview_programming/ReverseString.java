package interview_programming;

public class ReverseString {
    public static  void getString(String string ){
        String revString="";
        for(int i=string.length()-1;i>=0; i--){
            revString=revString+string.charAt(i);
        }
        System.out.println("After Reversed : "+revString);
    }

    public static void main(String[] args) {
        getString("A B C D E F");
    }


}
