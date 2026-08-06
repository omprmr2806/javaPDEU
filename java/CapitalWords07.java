import java.util.Scanner;

class CapitalWords {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        String words[] = str.split(" ");

        int count = 0;

        for (String w : words) {
            if (w.length() > 0 && Character.isUpperCase(w.charAt(0)))
                count++;
        }

        System.out.println("Words starting with capital letters = " + count);

        sc.close();
    }
}