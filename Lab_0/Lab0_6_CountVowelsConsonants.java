import java.util.*;

public class Lab0_6_CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a line: ");
        String line = sc.nextLine();

        int vowels = 0;
        int consonants = 0;

        for (char ch : line.toCharArray()) {
            if (Character.isLetter(ch)) {
                char c = Character.toLowerCase(ch);

                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Vowels = " + vowels);
        System.out.println("Consonants = " + consonants);

        sc.close();
    }
}
