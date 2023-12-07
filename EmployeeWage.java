package Day4_EmployeeWage_PP;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to the employee wage program");
        //final int IS_PRESENT = 1;
        final int FULL_TIME = 1;
        final int PART_TIME = 2;
        final int WAGE_PER_HRS = 20;
        final int MAX_WORKING_DAYS = 20;
        int empWage = 0;
        int empHrs = 0;
        int totalWage = 0;
        Random random = new Random();
        for (int i = 0; i<MAX_WORKING_DAYS; i++)
        {
            int randomNumber = random.nextInt(3);
            switch (randomNumber)
            {
                case FULL_TIME:
                    System.out.println("Full time employee is present");
                    empHrs = 8;
                    break;
                case PART_TIME:
                    System.out.println("Part time employee is present");
                    empHrs = 4;
                    break;
                default:
                    System.out.println("Employee is absent");
                    break;
            }
            empWage = empHrs * WAGE_PER_HRS;
            totalWage = totalWage + empWage;
            System.out.println("Employee daily wage : " + empWage);
        }


        System.out.println("TotalWage for" + MAX_WORKING_DAYS + " days is: " + totalWage);
    }
}
