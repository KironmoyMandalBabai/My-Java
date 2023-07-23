
import java.util.Scanner;

public class neonnum {
    static Scanner sc = new Scanner(System.in);   
    public static void main(String[] args){
        
    int num=sc.nextInt();
    int m = num * num;
        int sum = 0;
        System.out.println("input num is "+ num +" so "+ num +" * "+ num +" so the square is "+ m);
        while (m > 0) { 
            int r = m % 10;
            
            sum += r;
            System.out.print("+"+r);
            m /= 10;{
        
        }}
        System.out.print("="+sum+"\n");
        if (sum == num) {
        System.out.println("so added of this two ele is same of num so ");
            System.out.println(num + " is a Neon number");

        } else {
            System.out.println(num + " is not a Neon number");
        }
    }
}