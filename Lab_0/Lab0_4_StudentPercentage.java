import java.util.*;

public class Lab0_4_StudentPercentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double total = 0;

        System.out.println("Enter marks of 6 subjects:");
        for (int i = 1; i <= 6; i++) {
            System.out.print("Subject " + i + ": ");
            total += sc.nextDouble();
        }

        double percentage = total / 6.0;

        System.out.println("Total Marks = " + total);
        System.out.println("Percentage = " + percentage + "%");

        sc.close();
    }
}
