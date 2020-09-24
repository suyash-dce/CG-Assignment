public class employee {

	public static final int IS_FULL_TIME=0;
	public static final int IS_PART_TIME=1;
	
	public static void main(String[] args) {
		//Computation
		int EmpCategory = (int) Math.floor((Math.random()*10)%3);
		
		switch(EmpCategory) {
			case IS_FULL_TIME:
				System.out.println("Employee is Full Time");
				EmpHours = 8;
				break;
			case IS_PART_TIME:
				System.out.println("Employee is Part Time");
				EmpHours = 8;
				break;
			default:
				EmpHours =0;					
					
		}
		}
	}