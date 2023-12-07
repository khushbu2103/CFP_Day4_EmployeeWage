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
        final int MAX_WORKING_HRS = 100;
        int empWage = 0;
        int empHrs = 0;
        int totalWage = 0;
        int day = 1;
        int totalHrs = 0;
        Random random = new Random();
        while(day<=MAX_WORKING_DAYS && totalHrs<=MAX_WORKING_HRS)
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
            totalHrs += empHrs;
            day++;
            System.out.println("Employee wage per day " + day + " : " + empWage);
        }


        System.out.println("TotalWage for " + (day-1) + " is : " + totalWage + " and total hrs is : " + totalHrs);
    }
}
