import java.util.Scanner;
public class Employee {
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	int EmpRatePerHour=20;
	int MaxDays;
	int MaxHours;
	String company;
	int TotalEmpWage;
	
	public Employee(String company,int EmpRatePerHour,int maxDays,int maxHours) {
		this.company=company;
		this.EmpRatePerHour=EmpRatePerHour;
		this.MaxHours=MaxHours;
		this.MaxDays=MaxDays;
	}
	public int empAttendance() {
		int empCheck=(int) Math.floor(Math.random()*10)%3;
		return empCheck;
	}
	public void welcomeMessage() {
		System.out.println("Welcome to Employee Wage Computation Program");
	}
	public void checkAttendence(){
		switch (empAttendance()) {
		case IS_FULL_TIME:
			System.out.println("Employee is full time");
			break;
		case IS_PART_TIME:
			System.out.println("Employee is part time");
			break;
		default:
			System.out.println("Employee is absent");
		}
	}
	public int daliyWage(int n) {
		final int partTimeHours=4;
	        final int fullTimeHours=8;
		int empWage=0;
		switch (n) {
		case IS_FULL_TIME:
			empWage = (EmpRatePerHour*fullTimeHours);
			break;
		case IS_PART_TIME:
			empWage= (EmpRatePerHour*partTimeHours);
			break;
		default:
			break;
		}
		return empWage;
	}
	public void monthlyWage() {
		final int partTimeHours=4;
                final int fullTimeHours=8;
		int days = 0;
		int hours=0;
		int monthlyWage = 0;
		while (hours<=MaxHours || days<=MaxDays) {
			int n=empAttendance();
			switch (n) {
			case IS_FULL_TIME:
				monthlyWage+=daliyWage(n);
				hours+=fullTimeHours;
				break;
			case IS_PART_TIME:
				monthlyWage+=daliyWage(n);
				hours+=partTimeHours;
				break;
			default:
				break;
			}
			days++;
		}
		this.TotalEmpWage=monthlyWage;
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
		Employee EmployeeWageFn = new Employee(name,RatePerHour,DaysWorked,HoursWorked);
		EmployeeWageFn.monthlyWage();
		System.out.println("Dailys Wage of "+name+"'s Employee  is "+EmployeeWageFn.TotalEmpWage); 
		
	}
}
