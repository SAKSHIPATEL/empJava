package com.bridgelabz;

import java.util.Scanner;

public class Employee {
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	private final String company;
	private final int RATE_PER_HOUR;
	private final int workingDays;
	private final int maxHours;
	
	public Employee(String company,int RATE_PER_HOUR,int workingDays,int maxHours) {
		this.company=company;
		this.RATE_PER_HOUR=RATE_PER_HOUR;
		this.workingDays=workingDays;
		this.maxHours=maxHours;
		}
	private int Calculation() {
		int empHours=0,totalEmpHours=0,totalWorkingDays=0;
		
		while(totalEmpHours<=maxHours && totalWorkingDays<workingDays) {
			totalWorkingDays++;
			int check=(int) (Math.floor(Math.random()*10)%3);
			switch(check) {
			 case IS_FULL_TIME : empHours=8;
			 					 break;
			 case IS_PART_TIME : empHours=4;
			 					 break;
			 default : empHours=0;
			}
			totalEmpHours+=empHours;
			System.out.println("Day :"+totalWorkingDays+"Emp Hours :"+empHours);
			
		}
		System.out.println("Total Employee work Hours :"+totalEmpHours);
		return totalEmpHours*RATE_PER_HOUR;
	}
	public static void main(String[] args) {
		System.out.println("========Welcome to Employee Wage Computation========");
		Employee fab=new Employee("Facebook",20,20,100);
		Employee app=new Employee("Apple",35,35,100);
		Employee amz=new Employee("Amazon",30,30,200);
		Employee net=new Employee("Netflix",50,10,100);
		Employee gog=new Employee("Google",50,45,200);
		System.out.println("Total Employee Wage for "+fab.company+":"+fab.Calculation());
		System.out.println("Total Employee Wage for "+app.company+":"+app.Calculation());
		System.out.println("Total Employee Wage for "+amz.company+":"+amz.Calculation());
		System.out.println("Total Employee Wage for "+net.company+":"+net.Calculation());
		System.out.println("Total Employee Wage for "+gog.company+":"+gog.Calculation());
	}
}