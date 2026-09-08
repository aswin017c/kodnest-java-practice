import java.util.Scanner;
public class prg1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }
        
        int index = scan.nextInt();
        int num = scan.nextInt();


        int[] arr2 = new int[size+1];

        for (int  i =0 ; i < arr2.length  ; i++){
            if (i==index)
            {
                arr2[i] = num;
            }
            else 
            {
                if (i<index)
                {
                    arr2[i] = arr[i];
                }
                else 
                {
                    arr2[i] = arr[i-1];
                }
            }
            
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
        
        scan.close();
    }
}
