import java.util.*;
public class goru {
  {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
            System.out.println("enter the length:");
    int length=sc.nextInt();
    int[] arr=new int [length];
    System.out.print("enter the decimal num:");
    int n=sc.nextInt();
    int i=0;
    int rem;
    while(n>0){
       rem=n%16;
        if( rem>=10){
             rem=rem+55;
        }

        arr[i++]=(char) rem;
        n=n/16;
    }
            System.out.println("the hexa is:");
            for(int x=i-1;x>=0;x--){
//            System.out.println("\n");
        System.out.println(arr[x]);
    }
    }
    }
}
