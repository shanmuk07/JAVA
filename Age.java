import java.util.Scanner;
class Age{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int age;
        System.out.println("Enter Age : ");
        age = sc.nextInt();
        if(age >= 18){
            System.out.println("Eligible");
        }
        else{
            System.out.println("Not Eligible");
        }
    }
}