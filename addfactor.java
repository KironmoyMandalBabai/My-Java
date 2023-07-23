import java.util.Scanner;

public class addfactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        factorSum(number);
    }
    public static void factorSum(int number) {
        int sum = 0;
        
        System.out.print("Factors of " + number + ": ");
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                System.out.print(i + " ");
                sum += i;
            }
        }
        
        System.out.println("\nSum of factors: " + sum);
    }
}
