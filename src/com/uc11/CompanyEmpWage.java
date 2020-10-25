package com.uc11;

public class CompanyEmpWage {
	public final String company;
	public final int empRateperHour;
	public final int workingDays;
	public final int maxHours;
	public int totalEmpWage;
	
	public CompanyEmpWage(String company,int empRatePerHour,int workingDays,int maxHours) {
		this.company=company;
		this.empRateperHour=empRatePerHour;
		this.workingDays=workingDays;
		this.maxHours=maxHours;
	}
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage=totalEmpWage;
	}
	@Override
	public String toString() {
		return "Total Emp Wage for Company "+company+" is :"+totalEmpWage;
	}

}
