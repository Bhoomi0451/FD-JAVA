package Assignment1;
import java.util.Scanner;

public class primenum  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (num <= 1) {
            System.out.println("Not prime number.");
        } else {
            int count = 0;

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("  Prime number.");
            } else {
                System.out.println( "  Not Prime number.");
            }
        }
    }
}
