package Assignment1;
import java.util.Scanner;
public class pythagorean {
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int limit = sc.nextInt();
        for (int a = 1; a <= limit; a++) 
        {
            for (int b = a; b <= limit; b++) 
            { 
                int s = a * a + b * b;
                int c = (int)Math.sqrt(s);

                if (c * c == s && c <= limit) {
                    System.out.println(a + ", " + b + ", " + c);
                }
            }
        }
    }
}

    
