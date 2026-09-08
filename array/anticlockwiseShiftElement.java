import java.util.Scanner;

public class anticlockwiseShiftElement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of elements in array: ");
        int size = scan.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        int temp = arr[0];
        for (int i = 1; i < size; i++) {
            arr[i - 1] = arr[i];
        }

        arr[size - 1] = temp;
        System.out.println("Array after anticlockwise shift:");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        scan.close();
    }
}
