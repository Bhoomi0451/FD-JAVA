import java.util.Scanner;

public class condition {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr a no.=");
        int a= sc.nextInt();
        if(a==10)
        {
            System.out.println("O grade");
        }
        else if(a==9)
        {
            System.out.println("A+ grade");
        }
        else if(a==8)
        {
            System.out.println("A grade");
        }
        else if(a==7)
        {
            System.out.println("B+ grade");
        }
        else if(a==6)
        {
            System.out.println("B grade");
        }
        else if(a==5)
        {
            System.out.println("C grade");
        }
        else{
            System.out.println("E grade");
        }
    }

    
}
