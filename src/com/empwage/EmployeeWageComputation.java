package com.empwage;

public class EmployeeWageComputation {
    public static void main(String[] args) {
        int fullTime = 1;
        int partTime = 2;
        int empHour = 0;
        int empRatePerHour=20;
        int empWage = 0;
        System.out.println("\n******** Welcome To Employee Wage Computation ********");
        double Check = (int) Math.floor(Math.random() * 10) % 3;
        if (Check == partTime) {
            System.out.println("Employee is Part time.");
            empHour = 4;
        }
                 else if (Check == fullTime) {
            System.out.println("Employee is Full time.");
            empHour = 8;
        }
                 else{
        empHour = 0;
    }
          empWage = empHour * empRatePerHour;
           System.out.println("Employee Wage is: "+empWage);


        }

}

