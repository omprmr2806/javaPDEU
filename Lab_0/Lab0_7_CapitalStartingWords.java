import java.util.*;

public class Lab0_7_CapitalStartingWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String line = sc.nextLine();

        String[] words = line.trim().split("\\s+");
        int count = 0;

        for (String word : words) {
            if (!word.isEmpty() && Character.isUpperCase(word.charAt(0))) {
                count++;
            }
        }

        System.out.println("Words starting with capital letters = " + count);

        sc.close();
    }
}
