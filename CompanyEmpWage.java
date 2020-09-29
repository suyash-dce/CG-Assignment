public class CompanyEmpWage {
	
	public final String companyName;
	public final int wagePerHour;
	public final int maxWorkingDays;
	public final int maxWorkingHours;
	public int totalEmpWage;
	
	public CompanyEmpWage(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours) {
		
		this.companyName = companyName;
		this.wagePerHour = wagePerHour;
		this.maxWorkingDays = maxWorkingDays;
		this.maxWorkingHours = maxWorkingHours;
	}
	
	public void setTotalEmpWage(int totalEmpWage) {
		this.totalEmpWage = totalEmpWage;
	}
	
	public String toString() {
		return "Total Emp Wage for Company: "+companyName+" is: "+totalEmpWage;
	}
}	
