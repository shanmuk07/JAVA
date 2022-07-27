class Table{
	public static void main(String[] args){
		for(int i = 1; i <= 10; i++)
		{
			System.out.println(args[0] + " * " + i + " = " + Integer.parseInt(args[0]) * i);
		}
	}
}

/*

Output: 
javac Table.java
java Table 5
5 * 1 = 5
5 * 2 = 10
5 * 3 = 15
5 * 4 = 20
5 * 5 = 25
5 * 6 = 30
5 * 7 = 35
5 * 8 = 40
5 * 9 = 45
5 * 10 = 50

*/