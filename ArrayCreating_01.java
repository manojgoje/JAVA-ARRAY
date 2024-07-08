
import java.util.Scanner;

public class ArrayCreating_01 {
    public static void main(String[] args) {

        int arr []  = new int[10];
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter the array element here");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("numbers in array is :");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
