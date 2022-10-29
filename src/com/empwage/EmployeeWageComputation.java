package com.empwage;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        int fullTime = 1;
        int empRatePerHour=1;
        int empHour=0;
        int empWage=0;
        System.out.println("\n******** Welcome To Employee Wage Computation ********");
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if (empCheck == fullTime) {
            System.out.println("Employee Present!");
        } else {
            System.out.println("Employee Absent!");

        }
        empWage=empHour*empRatePerHour;
        System.out.println("Employee Daily Wage is: "+empWage);
    }
}

