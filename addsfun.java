import java.util.Scanner;

public class addsfun {
    public static void main(String[] args) {
        int number1, number2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        number1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        number2 = scanner.nextInt();

        int result = calculateAndAddSquares();
        System.out.println("Sum of the squares: " + result);
    }

    public static int calculateAndAddSquares() {
        int square1, square2, sum;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = scanner.nextInt();
        square1 = number1 * number1;

        System.out.print("Enter the second number: ");
        int number2 = scanner.nextInt();
        square2 = number2 * number2;

        sum = square1 + square2;
        return sum;
    }
}