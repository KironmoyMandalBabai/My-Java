import java.util.Scanner;
public class greatnum{
public static int greaterOfTwo(int num1, int num2) {
    if (num1 > num2) {
        return num1;
    } else {
        return num2;
    }
}
      
    
        public static void main(String[] arge){
           try (Scanner ki = new Scanner(System.in)) {
            System.out.println("enter one number");
            int c=ki.nextInt();
            System.out.println("enter 2nd num");
            int d=ki.nextInt();
            int greaterNum = greaterOfTwo(c,d);
            System.out.println("grater num is "+greaterNum);
            }
        }

        }
    
    

