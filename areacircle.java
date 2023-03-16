import java.util.Scanner;

public class areacircle {
        public static double cir(double radius) {
           
            double circumference = 2 * Math.PI * radius;
            return circumference;
        }
    

    static Scanner ki = new Scanner(System.in);
    public static void main(String[] arge){
        System.out.println("enter the radius");
double k=ki.nextInt();
double d=cir(k);
System.out.println("radius is "+d);
    }
}
