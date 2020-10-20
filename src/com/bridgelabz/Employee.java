package com.bridgelabz;

import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int WAGE_PER_HOUR=20;
		int full_day_hour=8;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		System.out.println("Show the status"+empCheck);
		if (empCheck == IS_FULL_TIME) {
			int Total_Wages=WAGE_PER_HOUR*full_day_hour;
			System.out.println("Total Wages are :"+Total_Wages);
		}
		else {
			System.out.println("Employee is absent");
		}
	}
}