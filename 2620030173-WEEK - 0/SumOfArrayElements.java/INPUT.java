import java.util.Scanner;

class SumOfArrayElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];
        int sum = 0;

        System.out.println("Enter 5 array elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
            sum = sum + arr[i];
        }

        System.out.println("Sum of Array Elements = " + sum);
    }
}