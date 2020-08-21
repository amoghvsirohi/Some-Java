/**
 * @author Amogh Vikram Sirohi
 */

class Prime{

    /**
     * Checks if the digits of the number contains numbers other than the specified number
     * @param n the number to be checked
     * @return boolean value
     */
    private static boolean checkDigits(int n)
    {
        while (n > 0) {
            int dig = n % 10;
            if (dig != 1 && dig != 2 && dig != 3 && dig != 5 && dig != 7 && dig != 9)
                return false;
            n /= 10;
        }
        return true;
    }

    /**
     * Checks if or not the number is prime and acts as a helper function
     * @param n the number to be checked
     * @return boolean value
     */
    private static boolean prime(int n)
    {
        if (n == 1)
            return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    /**
     * Checks if each digit is prime or not
     * @param n the number to be checked
     * @return boolean value
     */
    private static boolean hasProperties(int n)
    {
        while (n > 0) {
            if (prime(n))
                n /= 10;
            else
                return false;
        }
        return true;
    }

    /**
     * Checks if both the conditions are satisfied or not
     * @param n the number to be checked
     * @return boolean value
     */
    private static boolean isFullPrime(int n)
    {
        return (checkDigits(n) && hasProperties(n));
    }

    public static void main(String[] args)
    {
        for (int n=3; n <=73939233; n++){
            if (isFullPrime(n))
                System.out.printf("\n%d has the properties.", n);
        }
    }
}