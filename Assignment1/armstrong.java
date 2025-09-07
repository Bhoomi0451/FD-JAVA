package Assignment1;
import java.util.Scanner;
public class armstrong {
    public static void main(String[] args) {
        System.out.println("Enter a number=");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int sum=0;
        int temp=a;
        while(a!=0)
        {
           int b=a%10;
            sum=sum+(b*b*b);
            a=a/10;

        }
        if(sum==temp)
        {

            System.out.println("Armstrong number");
        }
        else
        System.out.println("Not Armstrong Number");
    }
    
}
