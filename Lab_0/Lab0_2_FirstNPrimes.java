import java.util.*;

public class Lab0_2_FirstNPrimes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        int count = 0;
        int num = 2;

        System.out.println("First " + n + " prime numbers:");
        while (count < n) {
            boolean prime = true;

            for (int i = 2; i * i <= num; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        System.out.println();
        sc.close();
    }
}
