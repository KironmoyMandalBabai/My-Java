import java.util.Scanner;
public class krishnamurthy {
      
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
    int num =sc.nextInt();
        int sum = 0;
        int f=1;
        while (num > 0) { 
        int r = num % 10;
          for(int i=0;i<=r;i++){
          f=f*i;
          sum=sum+f;}
          num=num/10;
        }
        if (num == sum) {
            System.out.println(num + " krishnamurthy num");
        } else {
            System.out.println(num + " is not a krishnamurthy number");
        }
    }
}
