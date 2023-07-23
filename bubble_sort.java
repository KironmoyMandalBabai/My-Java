import java.util.Scanner;

public class bubble_sort {
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
            for(int j=0;j<size-i-1;j++){
                if(arr[i]>arr[i+1]){
                   int temp=arr[i];
                   arr[i]=arr[i+1];
                   arr[i+1]=temp;
                }
            }  
        }
        System.out.println("\nafter sorting array");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
        }
    }    
}
