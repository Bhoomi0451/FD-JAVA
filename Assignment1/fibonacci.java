package Assignment1;
import java.util.Scanner;
public class fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter a number=");
        Scanner sc= new Scanner(System.in);
        int a = sc.nextInt();
        int first=0 ,second=1;
        System.out.print("Fibonacci series="+first+" "+second);
        for (int i=2;i<=a;i++)
        {
            int next=first+second;
            System.out.print(" "+next);
            first=second;
            second=next;

        }
        }
    
}
