import java.util.Scanner;

public class SieveOfEratosthenes {
    //following function will make the sieve
    public static int[] makeSieve(int upperBound)
    {
        int[] sieve = new int[upperBound+1];
        for(int i = 0;i < upperBound ; i++) {
            sieve[i] = 1;
        }
        sieve[0] = 1;
        sieve[1] = 1;
        for(int i =2 ; i<upperBound;i++)
        {
            if(isPrime(i))
            {
                sieve[i]=0;
            }
        }
        return sieve;
    }

    //following function will help making the sieve
    public static boolean isPrime(int number) {
        if (number == 1) return false;
        boolean b = true;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                b = false;
                break;
            }
        }
        return b;
    }


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter an upper bound: ");
        int bound = sc.nextInt();
        int[] sieve = makeSieve(bound);

        int n= 999;
        while(n!=0)
        {
            System.out.println("Enter a number (0 to quit): ");
            n = sc.nextInt();
            if(n == 0)
            {
                System.out.println("Goodbye!");
                break;
            }
            if(sieve[n]==0)
            {
                System.out.println(n + " is prime!");
            }
            else
            {
                System.out.println(n + " is not prime.");
            }
        }
    }

}
