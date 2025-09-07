package Assignment1;
import java.util.Scanner;
public class countdigit {
    public static void main(String[] args) {
        System.out.println("Enter a number=");
        Scanner sc=new Scanner(System.in);
        long a=sc.nextLong();
        int count=0;
        if (a<0)
        {
            a=-a;
        }
        if(a==0)
        {
            count=1;
        }
        else{
            while(a>0)
            {a=a/10;
            count++;
        }
    }
        System.out.println("digits="+count);
    }
}
