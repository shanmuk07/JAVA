import java.util.Scanner;
class Demo{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int empid;
		String ename,desg;
		float salary;
		char gender;
		long mobileno;
		System.out.println("Enter Employee ID : ");
		empid = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name : ");
		ename = sc.nextLine();
		System.out.println("Enter Employee Designation : ");
		desg = sc.nextLine();
		System.out.println("Enter Employee salary : ");
		salary = sc.nextFloat();
		System.out.println("Enter Employee Gender : ");
		gender = sc.next().charAt(0);
		System.out.println("Enter Employee Mobile Number : ");
		mobileno = sc.nextLong();
		System.out.println(empid + " " + ename + " " + desg + " " + salary +" " + gender + " " + mobileno);
		
	}
}