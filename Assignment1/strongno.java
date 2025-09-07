package Assignment1;
import java.util.Scanner;
public class strongno {
    public static void main(String[] args) {
        System.out.println("Enter a number=");
        Scanner sc= new Scanner(System.in);
        int a =sc.nextInt();
        int sum=0;
        int temp=a;
        while(a!=0)
        {
            
            int b= a%10;
            
            int fact=1;
            for(int i=1; i<=b;i++)
            {
                fact=fact*i;
            }
            sum=sum+fact;
            a=a/10;
        }

        if(sum==temp)
        {
            System.out.println("Strong number");
        }
        else 
        {

            System.out.println("Not Strong number");
        }
    
    }
    
}
