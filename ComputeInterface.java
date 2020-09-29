public interface IComputeEmpWage {
	public void addCompanyEmpWage(String companyName, int wagePerHour,int maxWorkingDays,int maxWorkingHours);
	public void computeEmpWage();
	public int getTotalWage(String companyName);
}
