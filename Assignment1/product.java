package Assignment1;
import java.util.Scanner;
public class product {
    public static void main(String[] args) {
        System.out.println("Enter a number=");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int product=1;
        for(int i=1;i<=10;i++)
        {
            product=a*i;
            System.out.println(product);
        }
       
    }
    
}
