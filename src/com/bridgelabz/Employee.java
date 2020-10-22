package com.bridgelabz;

import java.util.Scanner;

public class Employee {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS = 100;

	public static void main(String[] args) {
		Employee emp=new Employee();
		emp.Calculation();
	}
		
	public void Calculation() {
		int empHours = 0;
		int totalSalary = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;
		while (totalEmpHrs < MAX_HRS && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
			switch (empCheck) {
			case IS_FULL_TIME:
				empHours = 8;
				break;
			case IS_PART_TIME:
				empHours = 4;
				break;
			default:
				empHours = 0;
				break;
			}
			totalEmpHrs += empHours;
			System.out.println("Days : " + totalWorkingDays + "Emp hours : " + empHours);
		}
		totalSalary = RATE_PER_HOUR * totalEmpHrs;
		System.out.println("Total Salary of an employee in a month are : " + totalSalary);
	}
}