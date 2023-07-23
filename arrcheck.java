import java.util.*;

public class arrcheck {
    public static void main(String args[])
    {
        int found=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array");
        int ze=sc.nextInt();
        int num[]=new int[ze];
        System.out.println("enter element");
        for(int i =0; i<ze;i++){
            num[i]=sc.nextInt();
        }
        System.out.println("to be search");
        int x =sc.nextInt();
        for(int i=0;i<ze;i++){
        if(num[i]==x){
             found=1;
            }
        }
        if(found==1){
            System.out.println("succesful search");
        }
        else{
            System.out.println("not successful search");
        }

    }
}
