import java.util.Scanner;

public class countt2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = inp.nextInt();

        int count = 0; 
        do {
            count++;
            num /= 10;
        } while (num > 0);
         System.out.println("The number you entered has digits"  +  count);
         if(num%10==5){
          int r=num+5;
          System.out.println("the squre of this is "+r);
         }
    }
}

