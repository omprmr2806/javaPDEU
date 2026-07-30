import java.util.Scanner;
class PrimeNumber{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner("System.in");
        int n=sc.nextInt();
        // int n=5;
        for(int i=2; i*i<n; i++){
        if(n%i==0)
        {
            System.out.println("Not prime");
        }
        
        }
        else{
            System.out.println("prime number");
    }
    }
    sc.Close();
}
