package com.empwage;
public class EmployeeWageComputation {
    static final int fullTime = 1;
    static final int partTime=2;
    static final int empRatePerHour=20;
    static final int numOfWorkingDays=2;
    static final int maxHourMonth=10;
    public static int computeEmpWage(String companyName,int empRatePerHour,int numOfWorkingDays,int maxHourMonth){
        int empHour = 0;
        int totalEmpHour = 0;
        int totalWorkingDays = 0;
            while (totalEmpHour <= maxHourMonth && totalWorkingDays < numOfWorkingDays) {
                totalWorkingDays++;
                int Check = (int) Math.floor(Math.random() * 10) % 3;
                switch (Check) {
                    case partTime:
                        System.out.println("Employee is Full time.");
                        empHour=8;
                        break;
                    case fullTime:
                            System.out.println("Employee is Part time");
                            empHour=4;
                            break;
                    default:
                        empHour =0;
                    }
                    totalEmpHour += empHour;
                    System.out.println("Total Working Days: " + totalWorkingDays + " Employee Hours: " + empHour);

                }
                 int totalEmpWage = totalEmpHour * empRatePerHour;
                System.out.println("Total Employee Wage for company  "+companyName+" is " + totalEmpWage);
                return  totalEmpWage;
            }
    public static void main(String[] args) {
        System.out.println("\n******** Welcome To Employee Wage Computation ********");
        computeEmpWage("Wipro",20,2,10);
        computeEmpWage("RelienceJio",10,2,10);
        computeEmpWage("Wipro",30,2,10);
    }
}

