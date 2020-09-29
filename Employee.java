import java.util.Scanner;
public class Employee{
	final int IS_FULL_TIME=1;
	final int IS_PART_TIME=2;

	final int empRatePerHour;
	final int maxHours;
    final int maxDays;
	final String company;
	int totalEmpWage;

	public Employee(String company,int empRatePerHour,int maxDays,int maxHours) {
		this.company=company;
		this.empRatePerHour=empRatePerHour;
		this.maxHours=maxHours;
		this.maxDays=maxDays;
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
	public void monthlyWage() {
		final int partTimeHours=4;
                final int fullTimeHours=8;
		int days = 0;
		int hours=0;
		int monthlyWage = 0;
		while (hours<=maxHours || days<=maxDays) {
			int n=empAttendance();
			switch (n) {
			case IS_FULL_TIME:
				monthlyWage+=(empRatePerHour*fullTimeHours);
				hours+=fullTimeHours;
				break;
			case IS_PART_TIME:
				monthlyWage+=(empRatePerHour*partTimeHours);
				hours+=partTimeHours;
				break;
			default:
				break;
			}
			days++;
		}
		this.totalEmpWage=monthlyWage;
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
		System.out.println("Dailys Wage of "+name+"'s Employee  is "+EmployeeWageFn.totalEmpWage); 
		
	}
}

