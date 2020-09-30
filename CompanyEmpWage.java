import java.io.*;
import java.util.*;
public class CompanyEmpWage {
	
	public final String companyName;
	public final int wagePerHour;
	public final int maxWorkingDays;
	public final int maxWorkingHours;
	public int totalEmpWage;
	public ArrayList<Integer> dailyWageList;	
	public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
		
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
		this.dailyWageList=new ArrayList<Integer>();
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	public void getDailyWage() {			//For UC 13 and 14
		System.out.println(dailyWageList); 
	}
	
	public void setDailyWage(int DailyWage) {			//For UC 13 and 14
		dailyWageList.add(DailyWage);
	}
	
	public String toString() {
		return "Total Emp Wage for Company: "+companyName+" is: "+totalEmpWage;
	}
}	
