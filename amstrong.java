import java.util.Scanner;
     
public class amstrong{
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter a number");
       int number=sc.nextInt();

        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
    }
}

