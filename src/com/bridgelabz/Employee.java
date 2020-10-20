package com.bridgelabz;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int IS_PART_TIME = 2;
		int WAGE_PER_HOUR=20;
		int full_day_hour=8;
		int part_day_hour=4;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 3);
		System.out.println("Show the status"+empCheck);
		if (empCheck == IS_FULL_TIME) {
			int Total_Wages=WAGE_PER_HOUR*full_day_hour;
			System.out.println("Total Wages of full time hour are :"+Total_Wages);
		}
		else if (empCheck == IS_PART_TIME){
			int Total_Wages=WAGE_PER_HOUR*part_day_hour;
			System.out.println("Total Wages of part time hour are :"+Total_Wages);
		}
		else {
			System.out.println("Employee is not on the work very lazy !!!!!");
		}
	}
}