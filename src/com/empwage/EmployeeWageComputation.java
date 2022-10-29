package com.empwage;

public class EmployeeWageComputation {
    static final int fullTime = 1;
    static final int partTime=2;
    static final int empRatePerHour=20;

    public static void main(String[] args) {
        int empHour=0;
        int empWage=0;
        System.out.println("\n******** Welcome To Employee Wage Computation ********");
        int Check = (int) Math.floor(Math.random()*10) % 3;
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
                System.out.println("Em");
                break;
        }
            empWage=empHour*empRatePerHour;
        System.out.println("Employee Daily Wage is: "+empWage);
    }
}

