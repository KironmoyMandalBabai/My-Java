import java.util.Scanner;
public class cout_digit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int count = 0; 
        do {
            count++;
            num /= 10;
        } while (num > 0);
         System.out.println("The number you entered has digits"  +  count);
         if(count==5){
          Double r=(Math.pow(num,2));
          System.out.println("the squre of this is "+r);
         }
    }
}


