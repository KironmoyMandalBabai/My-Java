import java.util.Scanner;

public class sumfun {
    public static int add(int a, int b){
int sum=a+b;
return sum;
    }
    public static void main(String[]args){
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("enter 1st num");
            int a=sc.nextInt();
            System.out.println("enter 2nd num"); 
            int b=sc.nextInt();
            int sum =add(a,b);
            System.out.println(sum);
        }


    }
}
