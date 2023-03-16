import java.util.Scanner;

public class arr {
public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int size= sc.nextInt();
    int num[]=new int[size];
    for(int i=0;i<size;i++){
        num[i]=sc.nextInt();
    }
    for(int i=0;i<size;i++){
        System.out.println("elements are\n"+num[i]);
    }
}}
