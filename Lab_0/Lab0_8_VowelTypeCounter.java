import java.util.*;

public class Lab0_8_VowelTypeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int aCount = 0, eCount = 0, iCount = 0, oCount = 0, uCount = 0;

        while (true) {
            System.out.print("Enter a sentence (or type quit): ");
            String sentence = sc.nextLine();

            if (sentence.equalsIgnoreCase("quit")) {
                break;
            }

            for (char ch : sentence.toLowerCase().toCharArray()) {
                switch (ch) {
                    case 'a' -> aCount++;
                    case 'e' -> eCount++;
                    case 'i' -> iCount++;
                    case 'o' -> oCount++;
                    case 'u' -> uCount++;
                }
            }

            System.out.println("A = " + aCount);
            System.out.println("E = " + eCount);
            System.out.println("I = " + iCount);
            System.out.println("O = " + oCount);
            System.out.println("U = " + uCount);
        }

        System.out.println("\nTotal vowel count:");
        System.out.println("A = " + aCount);
        System.out.println("E = " + eCount);
        System.out.println("I = " + iCount);
        System.out.println("O = " + oCount);
        System.out.println("U = " + uCount);

        sc.close();
    }
}
