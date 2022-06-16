package exception_handeling;

public class DemoCustomException {

    public void dovoting(int age) throws AgeNotEligibleException {

        if (age < 18) {
            throw new AgeNotEligibleException("age is less than 18 so not eligible for voting");
        }
        else{
            System.out.println("welcome to voting app");
        }
    }

    public static void main(String[] args) {


        int age = 17;

        if (age < 18) {
            DemoCustomException obj= new DemoCustomException();
            try {
                obj.dovoting(age);
            } catch (AgeNotEligibleException e) {
                e.printStackTrace();
            }

        }
    }
}
