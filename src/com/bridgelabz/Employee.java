package com.bridgelabz;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR=20;
		int full_day_hour=8;
		int part_day_hour=4;
		int month_days=20;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Show the status"+empCheck);
		switch(empCheck) {
			case 0 : System.out.println("Employee is very lazy and absent");
					 break;
			case 1 : int Total_Wages=WAGE_PER_HOUR*full_day_hour;
					System.out.println("Total Wages for full time are :"+Total_Wages*month_days);
					break;
			case 2 : int Total_Part_Wages=WAGE_PER_HOUR*part_day_hour;
					 System.out.println("Total wages for part time are :"+Total_Part_Wages*month_days);
					 break;
			default : System.out.println("Out of reach");
					 break;
			
				
		}
	}
}