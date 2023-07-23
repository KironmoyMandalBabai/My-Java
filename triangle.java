import java.util.Scanner;

public class triangle {
  public static void main(String args[]) {
    try (Scanner sc = new Scanner(System.in)) {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int k=a+b+c;
        if(k == 180){
System.out.println("you can draw a triangle");
        }
        else{
            System.out.println("you can not draw");
        }

  } 
} 
}
