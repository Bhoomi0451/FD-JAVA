package Assignment1;
import java.util.Scanner;
public class palindrome {
    public static void main(String[] args) {

    System.out.println("Enter a number=");
    Scanner sc= new Scanner(System.in);
    int a = sc.nextInt();
    int rev=0;
    int temp=a;
    while(a!=0)
    {
        int i=a%10;
        rev=rev*10+i;
        a=a/10;
    }
    if(rev==temp)
    {
        System.out.println("Palindrome");
    }
    else
    {
        System.out.println("Not Palindrome");
    }

}
    
}
