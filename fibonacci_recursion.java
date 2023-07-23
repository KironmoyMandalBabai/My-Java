import java.util.Scanner;

public class fibonacci_recursion {

        public static void main(String[] args) {
            
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
              System.out.println("Fibonacci Series:");
            for (int c = 0; c< n; c++) {
                System.out.print(fibo(c) + " ");
            }
        }
        
        public static int fibo(int n) {
            if (n <= 1) {
                return n; 
            } else {
                return fibo(n - 1) + fibo(n - 2);
            }
        }
    }

