import java.util.Scanner;

public class Coffee2 {
    
    public static void main(String[] args) {
        
        int num;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter the Number :");

        num= sc.nextInt();

        if(num>0){
            System.out.println("number is positive");
        }
        else if(num<0){
            System.out.println("number is negative");
        }
        else{
            System.out.println("number is zero");
        }
        
    }
}
