public class employee {

	public static final int IS_PRESENT=0;
	public static void main(String[] args) {
		//computation
		double empCheck = (int) Math.floor((Math.random()*10)%2);
		System.out.println(empCheck);
		if(empCheck == IS_PRESENT) {
			System.out.println("Employee Present");
		}
		else {
			System.out.println("Employee Absent");
		}
		}
	}
		