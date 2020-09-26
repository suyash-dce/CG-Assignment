public class employee {
	
	public static final int IS_FULL_TIME=1;
	public static final int IS_PART_TIME=2;
	public static final int DAILY_HOURLY_WAGE=20;
	public static final int MIN_DAYS=20;
	
	public static void main(String[] args) {
		
		System.out.println("Welcome to the Employee Wage Computation Program.");
		
		int EmpWage=0;
		int EmpHours=0;
		int EmpIncome =0;
		int EmpSalary=0;
		int empCheck=(int)Math.floor(Math.random()*10)%3;
		int DaysWorked=(int)Math.floor(Math.random()*100)%21;
		
		switch(empCheck) {
			case IS_PART_TIME:
				System.out.println("The part-time employee is present.");
				EmpHours=8;
				EmpIncome=DAILY_HOURLY_WAGE*EmpHours*DaysWorked;
				System.out.println("The wage till the condition is reached is "+EmpIncome+".");
				break;
			case IS_FULL_TIME:
				System.out.println("The full-time employee is present.");
			    EmpHours=8;
			    int HOURS_LIMIT=100;
				EmpIncome=DAILY_HOURLY_WAGE*HOURS_LIMIT;
			    System.out.println("The wage till the condition is reached is "+EmpIncome+".");
			    break;
			default:
				System.out.println("The employee is absent.");
		}
		
		EmpWage=calculateWage(EmpHours,DAILY_HOURLY_WAGE);
		System.out.println("The daily employee wage is "+EmpWage+".");
		
		EmpSalary=calculateSalary(EmpHours,DAILY_HOURLY_WAGE,MIN_DAYS);
		System.out.println("The monthly employee wage is "+EmpSalary+".");
	
	}
	
	public static int calculateWage(int hours,int hourlyWage) {
		return hours*hourlyWage;
	}
	
	public static int calculateSalary(int hours,int hourlyWage,int days) {
		return hours*hourlyWage*days;
	}

