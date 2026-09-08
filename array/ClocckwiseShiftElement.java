import java.util.Scanner;

public class ClocckwiseShiftElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        int temp = arr[size - 1];
        for (int i = size - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }
        arr[0] = temp;

        System.out.println("Array after clockwise shift:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}
