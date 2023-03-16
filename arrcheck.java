import java.util.*;

public class arrcheck {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int ze=sc.nextInt();
        int num[]=new int[ze];
        System.out.println("enter element");
        for(int i =0; i<ze;i++){
            num[i]=sc.nextInt();
        }
        int x =sc.nextInt();

        for(int i=0;i<ze;i++){
        if(num[i]==x){
            System.out.println("find this element");
        }
        
     }

    }
}
