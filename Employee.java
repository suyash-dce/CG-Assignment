import java.util.*;
import java.util.*;
public class Employee implements ComputeInterface
{ 
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;

	private int numOfCompany=0;
	private ArrayList<CompanyEmpWage> CompList = new ArrayList<CompanyEmpWage>();

	

	private void addArray(String company,int empRatePerHour,int numOfWorkingDays, int maxHoursPerMonth) {

		CompanyEmpWage CompObj=new CompanyEmpWage(company,empRatePerHour,numOfWorkingDays,maxHoursPerMonth);

		CompList.add(CompObj);
	}
	public void calculateMonthlyWage() {
		for (CompanyEmpWage CompObj:CompList) {
			System.out.println(CompObj);
			System.out.println();
			CompObj.setTotalEmpWage(this.calculateMonthlyWage(CompObj));
		}
	}

	private int calculateMonthlyWage(CompanyEmpWage CompObj) {
		Random ran = new Random();
		int EmpHr=0; int DailyWage;
		int DaysWorked=0; int HrsWorked=0;
		System.out.println("~~~"+CompObj.companyName+"~~~");
		
		do { //Starting loop till condition fulfilled
		
			int EmpVal=ran.nextInt(3);			// Creating random int ranging 0 to 2
			DaysWorked++;
			System.out.println("Day: "+DaysWorked);
			
			switch(EmpVal) {
				case IS_FULL_TIME:
					System.out.println("Employee Present.");
					EmpHr=8;
					break;
				case IS_PART_TIME:
					System.out.println("Employee Present but working Part Time.");
					EmpHr=8;
					break;
				default:
					System.out.println("Employee Absent.");
					EmpHr=0;
			}
			
			HrsWorked=HrsWorked+EmpHr;
			DailyWage=EmpHr*CompObj.wagePerHour;
			CompObj.totalEmpWage=DailyWage+CompObj.totalEmpWage;
			System.out.println("Total Working Hours: "+HrsWorked);
			System.out.println("Employee daily wage is "+DailyWage);
		} while(DaysWorked<=CompObj.maxWorkingDays &&
				HrsWorked<=CompObj.maxWorkingHours);
		System.out.println();
		System.out.println("Employee monthly wage is "+CompObj.totalEmpWage);
		System.out.println();
		System.out.println("------------------------------------------------------");
		return CompObj.totalEmpWage;
	}
	public static void main(String[] args) {
		//creating object companies
		Employee BuilderObject = new Employee();
		BuilderObject.addArray("DG Global",20,20,100);
		BuilderObject.addArray("Mahindra & Mahindra",10,14,200);
		BuilderObject.addArray("Google Inc.",50,12,80);
		
		//running method
		BuilderObject.calculateMonthlyWage();
	}
}
