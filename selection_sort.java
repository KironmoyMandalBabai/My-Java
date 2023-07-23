import java.util.Scanner;

public class selection_sort {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int size =sc.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
            
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
        for(int i=0;i<size-1;i++){
            int kiru=i;
            for(int j=0;j<size;j++){
                if(arr[j]<arr[kiru]){
                    kiru=j;   
                }
            }
            int temp=arr[i];
            arr[i]=arr[kiru];
            arr[kiru]=temp;
        }
        System.out.println("\nafter sorting array");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }    
}
