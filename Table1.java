class Table1{
	public static void main(String[] args){
		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		for(int i = 1; i <= b; i++)
		{
			System.out.println(a + " * " + i + " = " + (a*i));
		} 
	}
}

/*

Output : 
javac Table1.java
java Table1 5 10
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10= 50

*/