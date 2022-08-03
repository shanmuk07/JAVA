import java.util.Scanner;
class Triangle{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        System.out.println("Enter a : ");
        a = sc.nextDouble();
        System.out.println("Enter b : ");
        b = sc.nextDouble();
        System.out.println("Enter c : ");
        c = sc.nextDouble();

        if( (a+b) > c && (a+c) > b  && (b+c) > a){
            System.out.println("Valid");
        }
        else{
            System.out.println(" Not Valid");
        }
       
    }
    
}