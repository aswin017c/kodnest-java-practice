import java.util.Scanner;
public class prg2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        int index = scan.nextInt();

        for (int  i =index ; i < arr.length-1  ; i++){
           if(i>=index) 
            {
                arr[i] = arr[i+1];
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        
        scan.close();
    }
}
