public class EmployeeWageUC1 {

	public static void main(String[] args) {
		int ratePerHr=20,empHr=0;
		System.out.println("Welcome to Employee Wage Problem");
		int full_time=1;
		int part_time=2;
		double empCheck=Math.floor(Math.random()*10)%3;
		switch((int)empCheck) {
		case 1: empHr=8;
				break;
		case 2: empHr=4;
				break;
		default:empHr=0;
				}
		System.out.println("DailyWage="+ratePerHr*empHr);
	 }

}
