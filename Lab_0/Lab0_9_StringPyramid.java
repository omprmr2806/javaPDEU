import java.util.*;

public class Lab0_9_StringPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        for (int i = 1; i <= str.length(); i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(str.charAt(j) + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
