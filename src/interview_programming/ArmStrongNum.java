package interview_programming;

public class ArmStrongNum {
    public static void getArmStrong(int num) {
        int tempNum = num, length = 0, remainder, sum = 0;
        while (tempNum > 0) {
            length = length + 1;
            tempNum = tempNum / 10;
        }
        //System.out.println(length);
        tempNum = num;
        while (tempNum > 0) {
            remainder = tempNum % 10;

            int production = 1;
            for (int i = 0; i < length; i++) {
                production = production * remainder;
            }
            //System.out.println(production);
            sum = sum + production;
            tempNum = tempNum / 10;
        }//System.out.println(sum);
        if (num == sum)
            System.out.println("this is ArmStrongNumber : " + num);
        else
            System.out.println("this is no ArmStrongNumber : " + num);
    }

    public static void main(String[] args) {
        // 153, 370, 371, 407 are three-digit Armstrong numbers and, 1634, 8208, 9474 are four-digit Armstrong numbers!!
        getArmStrong(371);
    }
}
