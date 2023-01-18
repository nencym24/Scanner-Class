import java.util.Scanner;

public class Coffee4 {
    
    public static void main(String[] args) {
        
        int a;
        Double b;
        Float c;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter value A : ");
        System.out.println("Enter value B : ");
        System.out.println("Enter value C : ");

        a= sc.nextInt();
        b= sc.nextDouble();
        c= sc.nextFloat();

        System.out.println("A = "+a);
        System.out.println("B = "+b);
        System.out.println("C = "+c);
    }
}
