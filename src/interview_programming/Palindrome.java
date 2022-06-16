package interview_programming;

public class Palindrome {
    public static void getNumbers(int num) {

        int remainder, revers = 0, palindrome = num;
        while (num != 0) {
            remainder = num % 10;
            revers = revers * 10 + remainder;
            num = num / 10;
        }
        if (palindrome == revers) {
            System.out.println("After reversed Number this is Palindrome Number : " + revers);
        } else {
            System.out.println("This Number is not Palindrome Number " + revers);
        }
    }


    public static void main(String[] args) {
        getNumbers(3553);
    }
}
