    import java.util.Scanner;
     
public class series1 {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        
    int num=sc.nextInt();
    double sum=0.0;
    double fat=1.0;
for(int i=1;i<=num;i++){
    fat*=i;
     sum+=i/fat;
}
System.out.println(sum);
    }
}
