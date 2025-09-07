package Assignment1;
import java.util.Scanner;
public class sumdigits {
    public static void main(String[] args) {
        System.out.println("Enter a number=");
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        while(a!=0)
        {
            int i=a%10;
            sum=sum+i;
            a=a/10;

        }
        System.out.println("sum is="+sum);
        
    }
}
