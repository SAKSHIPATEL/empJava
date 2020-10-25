package com.uc11;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class EmpWageBuilder implements IComputeEmpWage {
		public static final int IS_FULL_TIME=1;
		public static final int IS_PART_TIME=2;
		
		private int numofCompany=0;
		private LinkedList<CompanyEmpWage> companyEmpWageList;
		private Map<String,CompanyEmpWage> companyToEmpWageMap;
		
		public EmpWageBuilder() {
			companyEmpWageList = new LinkedList<>();
			companyToEmpWageMap = new HashMap<>();
		}
		public void addCompanyEmpWage(String company,int empRateperHour,int workingDays,int maxHours) {
			CompanyEmpWage companyEmpWage = new CompanyEmpWage(company,empRateperHour,workingDays,maxHours);
			companyEmpWageList.add(companyEmpWage);
			companyToEmpWageMap.put(company, companyEmpWage);
		}


		public void computeEmpWage(){
			for(int i=0;i<companyEmpWageList.size();i++) {
				CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
				companyEmpWage.setTotalEmpWage(this.computeEmpWages(companyEmpWage));
				System.out.println(companyEmpWage);
				
			}
			}
			private int computeEmpWages(CompanyEmpWage companyEmpWage) {
					int emphrs = 0, totalworkingdays = 0, totalEmphrs = 0;
					while (totalEmphrs < companyEmpWage.maxHours && totalworkingdays < companyEmpWage.workingDays) 
					{
						totalworkingdays++;
						int random = (int) Math.floor(Math.random() * 10) % 3;
						switch (random) {

						case 1:
							emphrs = 8;
							break;

						case 2:
							emphrs = 4;
							break;

						default:
							emphrs = 0;// not present

						}
						totalEmphrs += emphrs;
						//System.out.println("days" +totalworkingdays+ "Emphrs" +emphrs);
					}
					return totalEmphrs+companyEmpWage.empRateperHour;
					
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=========Welcome to Employee Wage Computation=======");
		IComputeEmpWage empWageBuilder = new EmpWageBuilder();
		empWageBuilder.addCompanyEmpWage("facebook",20,2,10);
		empWageBuilder.addCompanyEmpWage("apple",10,4,20);
		empWageBuilder.computeEmpWage();
	}

}
