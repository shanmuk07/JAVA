import java.util.Scanner;
class Triangle2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a : ");
        a = sc.nextDouble();
        System.out.println("Enter b : ");
        b = sc.nextDouble();
        System.out.println("Enter c : ");
        c = sc.nextDouble();
        if( a==b && b == c){
            System.out.println("Equilateral");
        }
        else if(a==b || a == c || b == c){
            System.out.println("Isoceles");
        }
        else{
             System.out.println("Scalene");
        }
        
    }
}