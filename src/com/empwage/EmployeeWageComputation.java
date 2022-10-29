package com.empwage;

public class EmployeeWageComputation {
    static final int fullTime = 1;
    static final int partTime=2;
    static final int empRatePerHour=20;
    static final int numOfWorkingDays=2;

    public static void main(String[] args) {
        int empHour = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        System.out.println("\n******** Welcome To Employee Wage Computation ********");
        for (int day = 0; day < numOfWorkingDays; day++) {
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
                    System.out.println("Employee Absent");
                    break;
            }
            empWage = empHour * empRatePerHour;
            totalEmpWage+=empWage;
            System.out.println("Employee Daily Wage is: " + empWage);
        }
        System.out.println("Total Emp Wage:"+totalEmpWage);
    }
}

