package Assignment1;
import java.util.Scanner;
public class sumnn {
    public static void main(String[] args) {
        System.out.println("Enter a number=");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int sum=0;
        for(int i=0;i<=a;i++)
        {
            
            sum+=i;

        }
        System.out.println("sum="+sum);
    }
}
