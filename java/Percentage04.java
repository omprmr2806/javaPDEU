import java.util.Scanner;

class Percentage {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int sum = 0;

        System.out.println("Enter marks of 6 subjects:");

        for (int i = 1; i <= 6; i++) {
            sum += sc.nextInt();
        }

        double percentage = sum / 6.0;

        System.out.println("Percentage = " + percentage + "%");

         sc.close();
    }
}