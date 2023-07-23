import java.util.Scanner;

public class ascnding {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
    int length= sc.nextInt();
    int arr[]=new int[length];
    for (int i = 0; i <length; i++) {
        arr[i] = sc.nextInt();
    }
    for (int i = 0; i < length; i++) {
        for (int j = i + 1; j < length; j++) {
            if(arr[j] <arr[i]){
               int t=arr[j];
               arr[j]=arr[i];
               arr[i]=t;

            }
        }
    } 
    System.out.println("now result" );
    for(int i=0;i<length;i++){
    System.out.println(arr[i]);
    }
  }
}