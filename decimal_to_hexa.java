import java.util.Scanner;

public class decimal_to_hexa {
    public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int decimal=sc.nextInt();
int hexa[]=new int[40];
int i=0;
while(decimal>0){
    hexa[i]=decimal%16; 
    decimal=decimal/16;
    i++;

}
for(int j=i-1;j>=0;j--){
    if(hexa[j]>9){
        System.out.print((char)(55+hexa[j]));
    }
    else
    System.out.print(hexa[j]);
}
    }
    
} 
    

