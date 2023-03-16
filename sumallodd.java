import java.util.Scanner;

public class sumallodd {
    public static int sumo(int n){ 

        int sum=0;
for(int i=0;i<=n;i++){
    if(i%2==1){
        sum=sum+i;
    }
}
return sum;
    }
    static Scanner ki = new Scanner(System.in);
    public static void main(String arge[]){
        int a=ki.nextInt();
        int k=sumo(a);
        System.out.println("sum of n odd number"+k);

        

    }
}
