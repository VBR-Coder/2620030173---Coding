import java.util.Scanner;

class ReverseOfArrayElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("Enter 5 array elements:");

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println("Reverse of Array Elements:");

        for (int i = 4; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }
}