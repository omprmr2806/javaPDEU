package Lab_5;
import java.util.*;

public class tryExcept {
    public static void main(String[] args){
        
        int[] arr={1,2,3,4,5,65};
        Scanner sc = new Scanner(System.in);
        int n=arr.length;

        System.out.print("Enter the index of the first number: ");
        int i = sc.nextInt();
        System.out.print("Enter the index of the second number: ");
        int j = sc.nextInt();
        try{
            double result=(float)arr[i]/arr[j];
            System.out.println("Result:"+ result);
        }catch(ArithmeticException e){
            System.out.println("Cannot divide by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Index out of bounds");
        }
    }
}
