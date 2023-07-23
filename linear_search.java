import java.util.*;
public class linear_search {
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
        int i=0;
        int found=0;
while(i<=size){
            if (arr[i] == x) {
               found =1;
                break;
            } else  i++; 
        }
        if(found == 1){
            System.out.println("find");
        }
        else System.out.println("not find");
    }
}