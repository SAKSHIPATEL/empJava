package com.bridgelabz;

public class Employee {

	public static void main(String[] args) {
		int IS_FULL_TIME = 1;
		int empCheck = (int) (Math.floor(Math.random() * 10) % 2);
		
		if (empCheck == IS_FULL_TIME) {
			System.out.println("Employee is present");
			
		}else {
			System.out.println("Employee is absent");
		}

	}

}
