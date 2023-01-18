import java.util.Scanner;

public class Coffee3 {

    public static void main(String[] args) {
        
        int a,b,c;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value A : ");
        System.out.println("Enter value B : ");
        System.out.println("Enter value C : ");
        
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a<b){
            if(a<c){
                System.out.println("A is Small");
            }else{
                System.out.println("C is Small");
            }
        }else{
            if(b<c){
                System.out.println("B is Small");
            }else{
                System.out.println("C is Small");
            }
        }
    }
    
}
