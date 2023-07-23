import java.util.Scanner;

public class bit1 {
     public static void main(String args[]){
         Scanner sc= new Scanner(System.in);
         int oper =sc.nextInt();
         int n=5;
         int pos=1;
         int bitmask=1<<pos;
         if(oper==1)
         {
            int newnum=bitmask|n;
            System.out.println(newnum);


         }
         else{
            int newbitmask =~(bitmask);
            int newnum=newbitmask&n;
            System.out.println(newnum);

         }

     }
}
 