public class employee {
	public static final int MIN_HOURS=100;
	public static final int MIN_DAYS=20;
	
	public static void main(String[] args) {
		//Conditional Wage
 		System.out.println("\n Conditional Wage:");
 		float HourlyWage = 20/8;
 		double DaysWorked = Math.floor((Math.random()*30));
 		double HoursWorked =  Math.floor((Math.random()*FULL_HOURS));
 		double HoursWorkedinMonth = DaysWorked*HoursWorked;
 		
 		if(HoursWorkedinMonth>=MIN_HOURS || DaysWorked>=MIN_DAYS) {
 	 		System.out.println("Monthly wage of Employee: "+ HoursWorkedinMonth*HourlyWage);

 		}
 		else {
 	 		System.out.println("Employee doesn't meet Required work Hours");

 		}
	}

}
