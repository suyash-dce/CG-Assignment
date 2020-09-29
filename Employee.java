import java.util.Scanner;
public class Employee implements ComputeInterface
{ 
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;

	private int numOfCompany=0;
	private CompanyEmpWage[] companyEmpWageArray;

	public Employee() {
	companyEmpWageArray= new CompanyEmpWage[5];
	}

	private void addCompanyEmpWage(String company,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth) {

		companyEmpWageArray[numOfCompany]=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);

		numOfCompany++;
	}

	private void computeEmpWage() {
		for (int i=0;i< numOfCompany; i++) {
			companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
			System.out.println(companyEmpWageArray[i]);
		}
	}

	private int computeEmpWage(CompanyEmpWage companyEmpWage) {
		int empHours=0, totalEmpHours=0, totalWorkingDays=0;
		while(totalEmpHours<=companyEmpWage.maxWorkingHours && totalWorkingDays<companyEmpWage.maxWorkingDays) {
			totalWorkingDays++;
			int empCheck=(int) Math.floor(Math.random() *10)%3;
			switch (empCheck) {
				case IS_FULL_TIME:
					empHours=8;
					break;
				case IS_PART_TIME:
					empHours=4;
                    break;
				default:
					empHours=0;
			}
			totalEmpHours+=empHours;
			System.out.println("Day#: "+ totalWorkingDays+" Emp Hr: " +empHours);
		}
		return totalEmpHours*companyEmpWage.wagePerHour;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Company Name: ");
		String name= sc.nextLine();
		System.out.println("Enter Rate Per Hour: ");
		int RatePerHour= sc.nextInt();
		System.out.println("Enter Days Worked: ");
		int DaysWorked= sc.nextInt();
		System.out.println("Enter Hours Worked: ");
		int HoursWorked= sc.nextInt();
		Employee EmployeeWageFn = new Employee();
		EmployeeWageFn.addCompanyEmpWage(name,RatePerHour,DaysWorked,HoursWorked);
		EmployeeWageFn.computeEmpWage(); 
		
	}
}

