public class Palindrome {
    public static void main(String[] args) {

        int n = 121;
        int temp = n;
        int reverse = 0;

        while (n > 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n / 10;
        }

        if (temp == reverse) {
            System.out.println("Palindrome Number");
        } 
        else {
            System.out.println("Not Palindrome Number");
        }
    }
}