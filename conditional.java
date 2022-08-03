class conditional{
    public static void main(String[] args){
        int x = 10;
        if(x > 7){
            System.out.println("Welcome");
            //break; -> will generate an error
            System.out.println("hello");
        }
        else{
            System.out.println("Hello");
        }
        switch(x){
            case 5+5:
                System.out.println("W");
                break;
            case 5*2:
                System.out.println("W");
                break;
        }
    }
}