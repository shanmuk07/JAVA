import java.util.Scanner;
class Mobile{
	public static void main(String[] args){
		String brand;
		float price;
		String model;
		char type;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter brand, price, model, chargetype of the mobile ");
		brand = sc.nextLine();
		price = sc.nextFloat();
		sc.nextLine();
		model = sc.nextLine();
		type = sc.next().charAt(0);
		System.out.println(brand + " " + price + " " + model + " " + type); 
	}
}

/* 

Output:

javac Mobile.java

java Mobile

Enter brand, price, model, chargetype of the mobile
Samsung
13999.99
M30sF311
c
Samsung 13999.99 M30sF311 c

*/