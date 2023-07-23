import java.util.*;
public class binary_search {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println("elements are\n"+arr[i]);
        }
        System.out.print("Enter the target value: ");
        int x = sc.nextInt();
        

        int low = 0;
        int high = 5 - 1;
        int result = -1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                result = mid;  
                break;
            } else if (arr[mid] <x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}