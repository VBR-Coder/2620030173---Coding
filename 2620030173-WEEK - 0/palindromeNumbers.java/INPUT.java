import java.util.Scanner;

class PalindromeNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 1; i < n; i++) {
            int num = i;
            int rev = 0;

            while (num > 0) {
                int digit = num % 10;
                rev = rev * 10 + digit;
                num = num / 10;
            }

            if (i == rev) {
                System.out.print(i + " ");
            }
        }
    }
}