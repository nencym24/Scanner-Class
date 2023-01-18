import java.util.Scanner;

public class Coffee1 {
 
    public static void main(String[] args) {
        
        int a,b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value A : ");
        System.out.println("Enter value B : ");
        
        a=sc.nextInt();
        b=sc.nextInt();

        if(a>b){
            System.out.println("A is Large..");
        }else{
            System.out.println("B is Large");
        }

    }
}
