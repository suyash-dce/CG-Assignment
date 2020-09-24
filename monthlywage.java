
public class employee {

	public static final int MIN_DAYS=20;
	public static final int DAILY_HOURLY_WAGE=20;
	
	public static void main(String[] args) {
		// Computation
		int EmpWage=0;
		EmpWage = EmpHours*DAILY_HOURLY_WAGE;
 		System.out.println("Wage of Employee: "+EmpWage);
 		
 		int MonthlyWage = EmpWage*MIN_DAYS;
 		 		
 		System.out.println("Monthly wage of Employee: "+MonthlyWage);
 		}
	}