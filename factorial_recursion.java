import java.util.Scanner;

public class factorial_recursion {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            int factorial = fact(number);
            System.out.println("Factorial of " + number + " is: " + factorial);
        }
        
        public static int fact(int n) {
            if (n == 0) {
                return 1; 
            } else {
                return n * fact(n - 1); 
            }
        }
    }
    
