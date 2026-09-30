import java.util.*;

public class Lab1_1_WeeklyTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperature = new double[7];

        for (int i = 0; i < 7; i++) {
            System.out.print("Enter temperature for day " + (i + 1) + ": ");
            temperature[i] = sc.nextDouble();
        }

        double sum = 0;
        double highest = temperature[0];
        double lowest = temperature[0];

        for (double temp : temperature) {
            sum += temp;
            highest = Math.max(highest, temp);
            lowest = Math.min(lowest, temp);
        }

        double average = sum / 7;
        int aboveAverage = 0;

        for (double temp : temperature) {
            if (temp > average) {
                aboveAverage++;
            }
        }

        System.out.println("\nAverage temperature = " + average);
        System.out.println("Highest temperature = " + highest);
        System.out.println("Lowest temperature = " + lowest);
        System.out.println("Days above average = " + aboveAverage);

        sc.close();
    }
}
