package Day4_EmployeeWage_PP;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage program");
        final int IS_PRESENT = 1;
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        if(IS_PRESENT == randomNumber)
        {
            System.out.println("Employee is present");
        }
        else
        {
            System.out.println("Employee is absent");
        }
    }
}
