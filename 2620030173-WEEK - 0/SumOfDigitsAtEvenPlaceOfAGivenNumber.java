import java.util.Scanner;

class SumOfDigitsAtEvenPlacesOfAGivenNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;
        int place = 1;

        while (n > 0) {
            int rem = n % 10;

            if (place % 2 == 0) {
                sum = sum + rem;
            }

            n = n / 10;
            place++;
        }

        System.out.println("Sum of Even Place Digits = " + sum);
    }
}