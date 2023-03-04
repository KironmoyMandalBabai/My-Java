
import java.util.Scanner;

public class mulfun {
    public static int mull(int a,int b){
        int y=a*b;
        return y;

    }
    static Scanner sc = new Scanner(System.in) ;
    public static void main(String[]args){
        System.out.println("entr mull to 1st num");
        int d=sc.nextInt();
        System.out.println("enter 2nd ele");
        int y=sc.nextInt();
        int mu=mull(d,y);
        System.out.println("ans is "+mu);
    }
    
}
