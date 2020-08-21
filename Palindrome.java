class Palindrome {
    /**
     * To check if the given number is a palindrome or not
     * @param n the number to be checked
     * @return a boolean value
     */
    private static boolean isPalindrome(int n) {
        int m = reversDigits(n);
        return m == n;
    }

    private static int reversDigits(int num) {
        int rev_num = 0;
        while (num > 0) {
            rev_num = rev_num * 10 + num % 10;
            num = num / 10;
        }
        return rev_num;
    }

    private static void check(int num) {
        int store = num;
        int i = 1;
        while (i <= 3) {

            int x = num + reversDigits(num);
            if (isPalindrome(x)) {
                System.out.printf("%d:      delayed %d : %d + %d = %d", store, i, num, reversDigits(num), num + reversDigits(num)).println();
                break;
            } else if (!isPalindrome(x)) {
                num = num + reversDigits(num);
                i++;

                if (i > 3) {
                    System.out.printf("%d:      delayed %d : does not become palindromic within 3 iterations (%d + %d = %d : %d != %d)", store, i-1, num, reversDigits(num), num + reversDigits(num), num + reversDigits(num), reversDigits(num + reversDigits(num))).println();
                    break;
                }
            }
        }
    }

    public static void main (String args[]){
        for (int i =69; i <=91;i++){
            check(i);
        }
    }
}