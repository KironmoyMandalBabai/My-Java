import java.util.Scanner;

public class avarage {
        public static int kiron(int a,int b,int c){
        int ava=(a+b+c)/3;
            return ava;
        }
        static Scanner sc = new Scanner(System.in);
        public static void main(String args[]){
            Scanner sc =new Scanner(System.in);
            System.out.println("enter 1st num");
            int a=sc.nextInt();
            System.out.println("enter 2nd num"); 
            int b=sc.nextInt();
            System.out.println("enter 3rd num");
            int c=sc.nextInt();

            int ava =kiron(a,b,c);
            System.out.println("avrage is "+9ava);
    
    

        }
    }
    
    

