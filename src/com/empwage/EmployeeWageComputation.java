package com.empwage;

public class EmployeeWageComputation {
    static final int fullTime = 1;
    static final int partTime=2;
    static final int empRatePerHour=20;
    static final int numOfWorkingDays=2;
    static final int maxHourMonth=10;

    public static void main(String[] args) {
        int empHour = 0;
        int empWage = 0;
        int totalEmpHour=0;
        int totalWorkingDays=0;
        System.out.println("\n******** Welcome To Employee Wage Computation ********");
       while(totalEmpHour <= maxHourMonth && totalWorkingDays<numOfWorkingDays){
           totalWorkingDays++;
            int Check = (int) Math.floor(Math.random() * 10) % 3;
            switch (Check) {
                case partTime:
                    empHour = 4;
                    System.out.println("Employee is Part time.");
                    break;

                case fullTime:
                    empHour = 8;
                    System.out.println("Employee is Full time.");
                    break;
                default:
                    break;
            }
            totalEmpHour+=empHour;
           System.out.println("Total Working Days: "+totalWorkingDays+ " Employee Hours: "+empHour);
            empWage = empHour * empRatePerHour;

        }

        int totalEmpWage=totalEmpHour*empRatePerHour;
        System.out.println("Total Employee Wage is: " + totalEmpWage);
    }
}

