import java.util.Scanner;

class VowelCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalA = 0, totalE = 0, totalI = 0, totalO = 0, totalU = 0;

        while (true) {
            System.out.print("Enter a sentence (or type 'quit' to stop): ");
            String str = sc.nextLine();

            if (str.equalsIgnoreCase("quit")) {
                break;
            }

            int a = 0, e = 0, i = 0, o = 0, u = 0;

            for (int j = 0; j < str.length(); j++) {
                char ch = Character.toLowerCase(str.charAt(j));

                switch (ch) {
                    case 'a':
                        a++;
                        totalA++;
                        break;
                    case 'e':
                        e++;
                        totalE++;
                        break;
                    case 'i':
                        i++;
                        totalI++;
                        break;
                    case 'o':
                        o++;
                        totalO++;
                        break;
                    case 'u':
                        u++;
                        totalU++;
                        break;
                }
            }

            System.out.println("Vowels in this sentence:");
            System.out.println("A = " + a);
            System.out.println("E = " + e);
            System.out.println("I = " + i);
            System.out.println("O = " + o);
            System.out.println("U = " + u);
        }

        System.out.println("\nTotal Vowel Count:");
        System.out.println("A = " + totalA);
        System.out.println("E = " + totalE);
        System.out.println("I = " + totalI);
        System.out.println("O = " + totalO);
        System.out.println("U = " + totalU);

        sc.close();
    }
}