class Student{
	public static void main(String[] args){
		System.out.println("Name : "+args[0]);
		System.out.println("Roll : "+args[1]);
		System.out.println("Subject1 : " + args[2] + "marks");
		System.out.println("Subject2 : " + args[3] + "marks");
		System.out.println("Subject3 : " + args[4] + "marks");
		System.out.println("Subject4 : " + args[5] + "marks");
		System.out.println("Subject5 : " + args[6] + "marks");
		System.out.println("Subject6 : " + args[7] + "marks");
		int total = 0;
		for(int i = 2; i <= 7; i++)
		{
			total += Integer.parseInt(args[i]);
		}
		System.out.println("Total Marks : " +total);
		float avg = total / 6;
		System.out.println("Averge Marks : "+avg);
	}
}

/* 
Output:


javac Student.java
java Student shanmukh 20A91A05G3 90 90 90 90 90 90
Name : shanmukh
Roll : 20A91A05G3
Subject1 : 90marks
Subject2 : 90marks
Subject3 : 90marks
Subject4 : 90marks
Subject5 : 90marks
Subject6 : 90marks
Total Marks : 540
Averge Marks : 90.0


*/