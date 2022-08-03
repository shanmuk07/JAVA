import java.util.Scanner;
class Vowel{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        char ch;
        System.out.println("Enter A character : ");
        ch = sc.next().charAt(0);
        if(ch == 'A' || ch ==  'E' || ch == 'I' || ch ==  'O' || ch == 'U'){
            System.out.println("Vowel");
        }
        else if(ch == 'a' || ch ==  'e' || ch == 'i' || ch ==  'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }

        switch(ch){
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
                
            case 'A':
                System.out.println("Vowel");
                break;
            case 'E':
                System.out.println("Vowel");
                break;
            case 'I':
                System.out.println("Vowel");
                break;
            
            case 'O':
                System.out.println("Vowel");
                break;
            case 'U':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    }
}