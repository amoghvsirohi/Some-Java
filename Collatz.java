import java.util.Scanner;

public class Collatz {

    //returns the collatz sequence calculated in recursive manner
    public static String recursiveSequence(int n)
    {
        String s="";
        if(n==1)
        {
            s = s +" 1";
            return s;
        }
        else if(n%2==0)
        {
            s = s + " "+ n + recursiveSequence(n/2);
        }
        else if(n%1==0)
        {
            s = s + " " + n + recursiveSequence((3*n) + 1 );
        }
        return s;
    }

    //returns the collatz sequence calculated in iterative manner
    public static String iterativeSequence(int n)
    {
        String s = ""+n;
        while(n!=1)
        {
            if(n%2==0)
            {
                s=s + " " + (n/2);
                n = n/2;
            }
            else
            {
                s =s + " " + ((3*n)+1);
                n = 3*n +1;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        int n = 999;
        Scanner sc = new Scanner(System.in);

        while (n!=0) {
            System.out.println("Enter a number (0 to quit):");
            n = sc.nextInt();

            if (n < 0) {
                System.out.println("Goodbye!");
            } else {
                String s = recursiveSequence(n);
                String st = iterativeSequence(n);
                System.out.println("Recursive Sequence: "+s);
                System.out.println("Iterative Sequence: "+st);
            }
        }
    }
}
