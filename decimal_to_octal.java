import java.util.Scanner;

public class decimal_to_octal {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int decimal=sc.nextInt();
int octal[]=new int[40];
int i=0;
while(decimal>0){
    octal[i]=decimal%8; 
    decimal=decimal/8;
    i++;

}
for(int j=i-1;j>=0;j--){
    System.out.print(octal[j]);
}
    }
    
} 
    

