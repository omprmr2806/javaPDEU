import java.util.Scanner;

public class WordPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a word: ");
        String word = sc.nextLine();

        int n = word.length();

        for (int i = 1; i <= n; i++) {

            // Leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Print letters with spaces
            for (int j = 0; j < i; j++) {
                System.out.print(word.charAt(j) + " ");
            }

            System.out.println();
        }

        sc.close();
    }
}